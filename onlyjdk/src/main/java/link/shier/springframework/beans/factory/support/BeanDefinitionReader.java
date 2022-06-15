package link.shier.springframework.beans.factory.support;

import link.shier.springframework.beans.BeansException;
import link.shier.springframework.core.io.Resource;
import link.shier.springframework.core.io.ResourceLoader;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-15 11:39
 * @see org.springframework.beans.factory.support.BeanDefinitionReader
 **/
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
