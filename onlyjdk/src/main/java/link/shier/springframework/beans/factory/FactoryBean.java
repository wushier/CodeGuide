package link.shier.springframework.beans.factory;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-05 17:03
 * @see org.springframework.beans.factory.FactoryBean
 **/
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
