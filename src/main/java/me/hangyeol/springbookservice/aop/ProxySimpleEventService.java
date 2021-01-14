package me.hangyeol.springbookservice.aop;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Section5. Spring
 * SimpleEventService 의 Proxy 객체
 * SimpleEventService 의 메서드를 delegate. 위임하여 추가 기능을 구현했다.
 * 그리고 @Primary 로 EventService 객체를 주입할 때 PoxySimpleEventService 를 주입하게 특정했다.
 */
//@Primary
//@Service
public class ProxySimpleEventService implements EventService{

    // private final SimpleEventService simpleEventService;

//    public ProxySimpleEventService(SimpleEventService simpleEventService) {
//        this.simpleEventService = simpleEventService;
//    }

    @Override
    public void createEvent() {
//        long begin = System.currentTimeMillis();
//        simpleEventService.createEvent();
//        System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void publishEvent() {
//        long begin = System.currentTimeMillis();
//        simpleEventService.publishEvent();
//        System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void deleteEvent() {
//        simpleEventService.deleteEvent();
    }
}
