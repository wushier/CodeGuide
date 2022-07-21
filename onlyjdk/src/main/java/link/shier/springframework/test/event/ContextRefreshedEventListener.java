package link.shier.springframework.test.event;

import link.shier.springframework.context.ApplicationListener;
import link.shier.springframework.context.event.ContextRefreshedEvent;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-21 15:47
 **/
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件：" + this.getClass().getName());
    }
}
