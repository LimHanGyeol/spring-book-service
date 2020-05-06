package me.hangyeol.springbookservice.resourceloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;

@Component
public class AppRunner5 implements ApplicationRunner {

    @Autowired
    ApplicationContext resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=== resourceLoader");

        System.out.println(resourceLoader.getClass());

        Resource resource = resourceLoader.getResource("test.txt");
        System.out.println(resource.getClass());
        System.out.println(resource.exists());
        System.out.println();
        System.out.println(resource.getDescription());
    }
}
