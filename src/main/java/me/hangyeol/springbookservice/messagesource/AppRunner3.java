package me.hangyeol.springbookservice.messagesource;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner3 implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("message source");
        while (true) {
            System.out.println(messageSource.getMessage("greeting", new String[]{"hangyeol"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"hangyeol"}, Locale.ENGLISH));
            Thread.sleep(1000);
        }


    }
}
