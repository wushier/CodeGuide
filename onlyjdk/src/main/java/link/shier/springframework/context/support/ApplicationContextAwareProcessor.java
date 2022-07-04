package link.shier.springframework.context.support;

import link.shier.springframework.beans.BeansException;
import link.shier.springframework.beans.factory.ApplicationContextAware;
import link.shier.springframework.beans.factory.config.BeanPostProcessor;
import link.shier.springframework.context.ApplicationContext;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-04 15:50
 **/
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
