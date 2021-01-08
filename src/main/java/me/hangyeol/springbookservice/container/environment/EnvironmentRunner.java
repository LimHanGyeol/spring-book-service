package me.hangyeol.springbookservice.container.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Section1. IoC 컨테이너와 빈
 * 6부 : Environment Profile, Properties
 * properties 파일과 JVM Option 중에서는 JVM Option 이 더 우선순위가 높다.
 */
@Component
public class EnvironmentRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    TestBookRepository testBookRepository;

    @Value("${app.about}")
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
