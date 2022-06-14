package com.shier.springframework.beans.factory;

import com.shier.springframework.beans.BeansException;
import com.shier.springframework.beans.factory.config.BeanDefinition;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-13 13:54
 * @see org.springframework.beans.factory.BeanFactory
 **/
public interface BeanFactory {

    Object getBean(String name);

    Object getBean(String name, Object... args) throws BeansException;

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
