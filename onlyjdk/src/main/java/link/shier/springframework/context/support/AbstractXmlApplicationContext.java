package link.shier.springframework.context.support;

import link.shier.springframework.beans.factory.support.DefaultListableBeanFactory;
import link.shier.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-06-29 19:11
 * @see org.springframework.context.support.AbstractXmlApplicationContext
 **/
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions();
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
