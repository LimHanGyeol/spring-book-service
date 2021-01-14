package me.hangyeol.springbookservice.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Section5. Spring AOP
 */
@Component
public class AopRunner implements ApplicationRunner {

    EventService eventService;

    public AopRunner(EventService eventService) {
        this.eventService = eventService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===== aop =====");
        eventService.createEvent();
        eventService.publishEvent();
        eventService.deleteEvent();
    }


}
