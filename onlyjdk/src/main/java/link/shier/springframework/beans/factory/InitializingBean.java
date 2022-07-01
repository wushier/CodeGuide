package link.shier.springframework.beans.factory;

import link.shier.springframework.beans.BeansException;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-06-30 15:34
 * @see org.springframework.beans.factory.InitializingBean
 **/
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     *
     * @throws Exception
     */
    void afterPropertiesSet() throws BeansException;
}
