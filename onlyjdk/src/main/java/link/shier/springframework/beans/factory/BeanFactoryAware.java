package link.shier.springframework.beans.factory;

import link.shier.springframework.beans.BeansException;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-04 15:31
 * @see org.springframework.beans.factory.BeanFactoryAware
 **/
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
