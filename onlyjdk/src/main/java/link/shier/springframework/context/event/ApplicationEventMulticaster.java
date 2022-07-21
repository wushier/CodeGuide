package link.shier.springframework.context.event;

import link.shier.springframework.context.ApplicationEvent;
import link.shier.springframework.context.ApplicationListener;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-19 14:55
 * @see org.springframework.context.event.ApplicationEventMulticaster
 **/
public interface ApplicationEventMulticaster {

    /**
     * Add a listener to be notified of all events.
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);
}
