package link.shier.springframework.context.event;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-19 14:39
 * @see org.springframework.context.event.ContextClosedEvent
 **/
public class ContextClosedEvent extends ApplicationContextEvent{

    public ContextClosedEvent(Object source) {
        super(source);
    }
}
