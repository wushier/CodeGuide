package link.shier.springframework.beans.factory.config;

import link.shier.springframework.beans.BeansException;
import link.shier.springframework.beans.factory.BeanFactory;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-28 15:55
 * @see org.springframework.beans.factory.config.AutowireCapableBeanFactory
 **/
public interface AutowireCapableBeanFactory extends BeanFactory {

    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName)
            throws BeansException;

    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName)
            throws BeansException;
}
