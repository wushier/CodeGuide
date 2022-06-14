package com.shier.springframework.beans.factory.support;

import com.shier.springframework.BeansException;
import com.shier.springframework.beans.factory.config.BeanDefinition;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * @program: CodeGuide
 * @description: cglib实现构造器生成bean
 * @author: CHUYAN
 * @create: 2022-06-14 14:54
 * @see org.springframework.beans.factory.support.CglibSubclassingInstantiationStrategy
 **/
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy{

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClazz());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (null == ctor) return enhancer.create();
        return enhancer.create(ctor.getParameterTypes(), args);
    }

}
