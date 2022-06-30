package link.shier.springframework.test.common;

import link.shier.springframework.beans.BeansException;
import link.shier.springframework.beans.PropertyValue;
import link.shier.springframework.beans.PropertyValues;
import link.shier.springframework.beans.factory.config.BeanDefinition;
import link.shier.springframework.beans.factory.config.BeanFactoryPostProcessor;
import link.shier.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-06-29 20:02
 **/
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }
}
