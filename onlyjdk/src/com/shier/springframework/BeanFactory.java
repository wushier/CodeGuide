package com.shier.springframework;

import com.shier.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
