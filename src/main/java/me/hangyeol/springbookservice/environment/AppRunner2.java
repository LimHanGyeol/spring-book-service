package me.hangyeol.springbookservice.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner2 implements ApplicationRunner {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    TestBookRepository testBookRepository;

    @Value("${app.name}")
    String appName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = ctx.getEnvironment();

        System.out.println("profiles");
        System.out.println(Arrays.toString(environment.getActiveProfiles()));
        System.out.println(Arrays.toString(environment.getDefaultProfiles()));

        System.out.println("propertis");
        System.out.println(environment.getProperty("app.name"));
        System.out.println(environment.getProperty("app.about"));

        System.out.println("app Name");
        System.out.println(appName);
    }
}
