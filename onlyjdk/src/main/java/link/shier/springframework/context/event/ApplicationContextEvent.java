package link.shier.springframework.context.event;

import link.shier.springframework.context.ApplicationContext;
import link.shier.springframework.context.ApplicationEvent;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-19 14:36
 * @see org.springframework.context.event.ApplicationContextEvent
 **/
public class ApplicationContextEvent extends ApplicationEvent {

    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
