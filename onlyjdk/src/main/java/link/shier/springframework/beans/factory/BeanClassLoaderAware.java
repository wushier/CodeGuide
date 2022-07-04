package link.shier.springframework.beans.factory;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-04 15:42
 * @see org.springframework.beans.factory.BeanClassLoaderAware
 **/
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader);

}
