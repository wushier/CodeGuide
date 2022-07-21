package link.shier.springframework.test.event;

import link.shier.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-07-19 17:59
 **/
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + "消息;时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }
}
