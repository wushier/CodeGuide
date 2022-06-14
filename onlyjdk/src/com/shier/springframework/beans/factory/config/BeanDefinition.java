package com.shier.springframework.beans.factory.config;

/**
 * @program: CodeGuide
 * @description: &#x624B;&#x5199;spring
 * @author: CHUYAN
 * @create: 2022-06-13 10:48
 * @see org.springframework.beans.factory.config.BeanDefinition
 **/
public class BeanDefinition {

    private Class beanClazz;

    public BeanDefinition(Class beanClazz) {
        this.beanClazz = beanClazz;
    }

    public Class getBeanClazz() {
        return beanClazz;
    }
}
