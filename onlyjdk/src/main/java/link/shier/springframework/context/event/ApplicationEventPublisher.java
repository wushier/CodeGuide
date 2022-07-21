package link.shier.springframework.context.event;

import link.shier.springframework.context.ApplicationEvent;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-19 16:42
 * @see org.springframework.context.ApplicationEventPublisher
 **/
public interface ApplicationEventPublisher {

    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     * @param event the event to publish
     */
    void publishEvent(ApplicationEvent event);
}
