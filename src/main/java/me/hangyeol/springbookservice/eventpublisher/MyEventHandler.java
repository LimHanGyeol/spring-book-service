package me.hangyeol.springbookservice.eventpublisher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {


    @EventListener
    @Async
    public void handleEvent(MyEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트를 받았다. 데이터는 " + event.getData());
    }

    @EventListener
    @Async
    public void handleEvent(ContextRefreshedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("---ContextRefreshedEvent");
    }

    @EventListener
    @Async
    public void handleEvent(ContextClosedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("---ContextClosedEvent");
    }
}
