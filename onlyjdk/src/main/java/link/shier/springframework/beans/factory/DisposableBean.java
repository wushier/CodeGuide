package link.shier.springframework.beans.factory;

import link.shier.springframework.beans.BeansException;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-06-30 15:38
 * @see org.springframework.beans.factory.DisposableBean
 **/
public interface DisposableBean {

    void destroy() throws Exception;

}
