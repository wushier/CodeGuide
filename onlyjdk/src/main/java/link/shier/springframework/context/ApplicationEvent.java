package link.shier.springframework.context;

import java.util.EventObject;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-19 14:31
 * @see org.springframework.context.ApplicationEvent
 **/
public abstract class ApplicationEvent extends EventObject {


    public ApplicationEvent(Object source) {
        super(source);
    }
}
