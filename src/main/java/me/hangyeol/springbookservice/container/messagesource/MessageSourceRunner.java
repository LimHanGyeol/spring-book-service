package me.hangyeol.springbookservice.container.messagesource;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * Section1. IoC 컨테이너와 빈
 * 6부 : MessageSource
 */
@Component
public class MessageSourceRunner implements ApplicationRunner {

    MessageSource messageSource;

    public MessageSourceRunner(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("message source");
            System.out.println(messageSource.getMessage("greeting", new String[]{"hangyeol"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"hangyeol"}, Locale.ENGLISH));
    }

}
