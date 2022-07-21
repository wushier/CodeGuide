package link.shier.springframework.context.event;

import link.shier.springframework.beans.factory.BeanFactory;
import link.shier.springframework.context.ApplicationEvent;
import link.shier.springframework.context.ApplicationListener;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-19 17:25
 * @see org.springframework.context.event.SimpleApplicationEventMulticaster
 **/
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster{

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
