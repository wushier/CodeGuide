package link.shier.springframework.beans.factory;

import link.shier.springframework.beans.BeansException;
import link.shier.springframework.beans.factory.config.BeanDefinition;

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

    <T> T getBean(String name, Class<T> requiredType);
}
