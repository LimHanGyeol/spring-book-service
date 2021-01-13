package me.hangyeol.springbookservice.container.eventpublisher;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Section1. IoC 컨테이너와 빈
 * 8부 : Application Event Publisher
 */
@Component
public class MyEventHandler {

//    @Async
    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public void handleEvent(MyEvent event) {
        System.out.println("//////////////// MyEvent Thread" + Thread.currentThread().toString());
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
