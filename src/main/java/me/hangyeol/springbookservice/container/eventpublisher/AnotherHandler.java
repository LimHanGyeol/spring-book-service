package me.hangyeol.springbookservice.container.eventpublisher;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Section1. IoC 컨테이너와 빈
 * 8부 : Application Event Publisher
 */
@Component
public class AnotherHandler {

    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE + 2)
    public void handlerEvent(MyEvent myEvent) {
        System.out.println("//////////////// Another Event Thread" + Thread.currentThread().toString());
        System.out.println("Another Event " + myEvent.getData());
    }

}
