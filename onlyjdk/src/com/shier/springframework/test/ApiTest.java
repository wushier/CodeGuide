package com.shier.springframework.test;

import com.shier.springframework.beans.factory.config.BeanDefinition;
import com.shier.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.shier.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-13 15:42
 **/
public class ApiTest {

//    @Test
//    public void test_BeanFactory(){
////        // 1.初始化 BeanFactory
////        BeanFactory beanFactory = new BeanFactory();
////
////        // 2.注册 bean
////        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
////        beanFactory.registerBeanDefinition("userService", beanDefinition);
////
////        // 3.获取 bean
////        UserService userService = (UserService) beanFactory.getBean("userService");
////        userService.queryUserInfo();
//    }

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}
