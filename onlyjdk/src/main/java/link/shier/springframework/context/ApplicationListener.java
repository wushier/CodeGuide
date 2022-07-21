package link.shier.springframework.context;


import java.util.EventListener;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-19 15:25
 * @see org.springframework.context.ApplicationListener
 **/
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    void onApplicationEvent(E event);
}
