package link.shier.springframework.beans.factory.config;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-13 16:56
 * @see org.springframework.beans.factory.config.SingletonBeanRegistry
 **/
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
    void registerSingleton(String beanName, Object singletonObject);

}
