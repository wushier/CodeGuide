package link.shier.springframework.test.event;

import link.shier.springframework.context.ApplicationListener;
import link.shier.springframework.context.event.ContextClosedEvent;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-21 15:45
 **/
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + this.getClass().getName());
    }
}
