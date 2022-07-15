package link.shier.springframework.beans.factory.support;

import cn.hutool.core.lang.Assert;
import link.shier.springframework.beans.BeansException;
import link.shier.springframework.beans.factory.FactoryBean;
import link.shier.springframework.beans.factory.config.BeanDefinition;
import link.shier.springframework.beans.factory.config.BeanPostProcessor;
import link.shier.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.util.ClassUtils;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-13 17:06
 * @see org.springframework.beans.factory.support.AbstractBeanFactory
 **/
public abstract class AbstractBeanFactory extends FactoryBeanRegistrySupport implements ConfigurableBeanFactory {

    private final List<BeanPostProcessor> beanPostProcessors = new CopyOnWriteArrayList<>();

    private ClassLoader beanClassLoader = ClassUtils.getDefaultClassLoader();

    public List<BeanPostProcessor> getBeanPostProcessors() {
        return this.beanPostProcessors;
    }

    protected <T> T doGetBean(final String name, final Object... args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            // 如果是 FactoryBean，则需要调用 FactoryBean#getObject
            return (T) getObjectForBeanInstance(bean,name);
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        Object newBean = createBean(name, beanDefinition, args);
        return (T) getObjectForBeanInstance(newBean,name);
    }


    private Object getObjectForBeanInstance(Object beanInstance, String beanName) {
        if (!(beanInstance instanceof FactoryBean)) {
            return beanInstance;
        }

        Object object = getCachedObjectForFactoryBean(beanName);

        if (object == null) {
            FactoryBean<?> factoryBean = (FactoryBean<?>) beanInstance;
            object = getObjectFromFactoryBean(factoryBean, beanName);
        }

        return object;
    }

    @Override
    public Object getBean(String name,Object... args) throws BeansException {
        return doGetBean(name,args);
    }

    @Override
    public Object getBean(String name) {
        return doGetBean(name,null);
    }

    @Override
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor) {
        Assert.notNull(beanPostProcessor, "BeanPostProcessor must not be null");
        // Remove from old position, if any
        this.beanPostProcessors.remove(beanPostProcessor);
        // Add to end of list
        this.beanPostProcessors.add(beanPostProcessor);
    }

    @Override
    public ClassLoader getBeanClassLoader() {
        return this.beanClassLoader;
    }

    private volatile boolean hasInstantiationAwareBeanPostProcessors;

    /** Indicates whether any DestructionAwareBeanPostProcessors have been registered. */
    private volatile boolean hasDestructionAwareBeanPostProcessors;

    @Override
    public <T> T getBean(String name, Class<T> requiredType) {
        return (T) doGetBean(name);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;
}
