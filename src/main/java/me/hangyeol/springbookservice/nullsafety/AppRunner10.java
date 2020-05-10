package me.hangyeol.springbookservice.nullsafety;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner10 implements ApplicationRunner {

    @Autowired
    EventService eventService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===== null-safety =====");
        String message = eventService.createEvent("hangyeol");
        System.out.println(message);
    }
}
