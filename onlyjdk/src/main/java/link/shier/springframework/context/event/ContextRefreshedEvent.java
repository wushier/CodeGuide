package link.shier.springframework.context.event;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-19 14:41
 * @see org.springframework.context.event.ContextRefreshedEvent
 **/
public class ContextRefreshedEvent extends ApplicationContextEvent{

    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
