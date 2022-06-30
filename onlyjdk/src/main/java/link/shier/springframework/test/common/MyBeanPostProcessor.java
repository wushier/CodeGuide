package link.shier.springframework.test.common;

import link.shier.springframework.beans.BeansException;
import link.shier.springframework.beans.factory.config.BeanPostProcessor;
import link.shier.springframework.test.bean.UserService;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-06-29 20:03
 **/
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }


}
