package me.hangyeol.springbookservice.nullsafety;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class NullSafetyRunner implements ApplicationRunner {

    EventService eventService;

    public NullSafetyRunner(EventService eventService) {
        this.eventService = eventService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===== null-safety =====");
        String message = eventService.createEvent("hangyeol");
        System.out.println(message);
    }
}
