package com.shier.springframework.beans.factory.config;

import com.shier.springframework.beans.PropertyValues;

/**
 * @program: CodeGuide
 * @description: &#x624B;&#x5199;spring
 * @author: CHUYAN
 * @create: 2022-06-13 10:48
 * @see org.springframework.beans.factory.config.BeanDefinition
 **/
public class BeanDefinition {

    private Class beanClazz;

    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClazz) {
        this.beanClazz = beanClazz;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClazz, PropertyValues propertyValues) {
        this.beanClazz = beanClazz;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClazz() {
        return beanClazz;
    }

    public void setBeanClazz(Class beanClazz) {
        this.beanClazz = beanClazz;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
