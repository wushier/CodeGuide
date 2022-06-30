package link.shier.springframework.beans.factory.config;

import link.shier.springframework.beans.BeansException;
import link.shier.springframework.beans.factory.ListableBeanFactory;
import link.shier.springframework.beans.factory.NoSuchBeanDefinitionException;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-28 16:00
 * @see org.springframework.beans.factory.config.ConfigurableListableBeanFactory
 **/
public interface ConfigurableListableBeanFactory extends ConfigurableBeanFactory,ListableBeanFactory,AutowireCapableBeanFactory{

    BeanDefinition getBeanDefinition(String beanName) throws NoSuchBeanDefinitionException;

    void preInstantiateSingletons() throws BeansException;

}
