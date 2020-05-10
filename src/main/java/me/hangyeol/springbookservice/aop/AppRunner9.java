package me.hangyeol.springbookservice.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner9 implements ApplicationRunner {

    @Autowired
    EventService eventService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===== aop =====");
        eventService.createEvent();
        eventService.publishEvent();
        eventService.deleteEvent();
    }


}
