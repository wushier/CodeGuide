package link.shier.springframework.context;

import link.shier.springframework.beans.BeansException;

import java.io.Closeable;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-28 16:34
 * @see org.springframework.context.ConfigurableApplicationContext
 **/
public interface ConfigurableApplicationContext extends ApplicationContext, Closeable {
    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
