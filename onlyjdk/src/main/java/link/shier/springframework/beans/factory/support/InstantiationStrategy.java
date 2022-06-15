package link.shier.springframework.beans.factory.support;

import link.shier.springframework.beans.BeansException;
import link.shier.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-14 14:25
 * @see org.springframework.beans.factory.support.InstantiationStrategy
 **/
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
