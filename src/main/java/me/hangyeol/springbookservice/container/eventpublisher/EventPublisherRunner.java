package me.hangyeol.springbookservice.container.eventpublisher;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Section1. IoC 컨테이너와 빈
 * 8부 : Application Event Publisher
 */
@Component
public class EventPublisherRunner implements ApplicationRunner {

    private final ApplicationEventPublisher publishEvent;

    public EventPublisherRunner(ApplicationEventPublisher publishEvent) {
        this.publishEvent = publishEvent;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        publishEvent.publishEvent(new MyEvent(this, 100));
    }

}
