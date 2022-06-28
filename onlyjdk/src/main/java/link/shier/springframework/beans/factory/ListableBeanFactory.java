package link.shier.springframework.beans.factory;

import link.shier.springframework.beans.BeansException;
import org.springframework.lang.Nullable;

import java.util.Map;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-06-28 15:50
 * @see org.springframework.beans.factory.ListableBeanFactory
 **/
public interface ListableBeanFactory extends BeanFactory{

    <T> Map<String, T> getBeansOfType(@Nullable Class<T> type) throws BeansException;

    String[] getBeanDefinitionNames();

}
