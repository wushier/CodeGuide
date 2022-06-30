package link.shier.springframework.context.support;

import link.shier.springframework.beans.BeansException;
import link.shier.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import link.shier.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-06-29 16:55
 * @see org.springframework.context.support.AbstractRefreshableApplicationContext
 **/
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;


    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }


    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }
}
