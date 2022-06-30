package link.shier.springframework.beans.factory.config;

import link.shier.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-28 15:58
 * @see org.springframework.beans.factory.config.ConfigurableBeanFactory
 **/
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory,SingletonBeanRegistry{

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
