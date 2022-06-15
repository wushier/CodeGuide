package link.shier.springframework.beans.factory.support;

import link.shier.springframework.beans.factory.config.BeanDefinition;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-13 17:48
 * @see org.springframework.beans.factory.support.BeanDefinitionRegistry
 **/
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    boolean containsBeanDefinition(String beanName);
}
