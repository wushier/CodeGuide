package link.shier.springframework.beans.factory;

import link.shier.springframework.beans.BeansException;
import link.shier.springframework.context.ApplicationContext;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-04 15:45
 * @see org.springframework.context.ApplicationContextAware
 **/
public interface ApplicationContextAware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException
            ;

}
