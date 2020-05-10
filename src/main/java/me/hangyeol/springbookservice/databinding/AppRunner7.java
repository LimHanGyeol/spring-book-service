package me.hangyeol.springbookservice.databinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.web.format.WebConversionService;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class AppRunner7 implements ApplicationRunner {

//    @Autowired
//    ConversionService conversionService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===== ConversionService =====");
//        System.out.println(conversionService.getClass().toString());

//        System.out.println(conversionService);
    }
}
