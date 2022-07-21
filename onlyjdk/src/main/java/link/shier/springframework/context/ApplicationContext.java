package link.shier.springframework.context;

import link.shier.springframework.beans.factory.ListableBeanFactory;
import link.shier.springframework.context.event.ApplicationEventPublisher;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-28 16:31
 * @see org.springframework.context.ApplicationContext
 **/
public interface ApplicationContext extends ListableBeanFactory, ApplicationEventPublisher {
}
