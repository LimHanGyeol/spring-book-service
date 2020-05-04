package me.hangyeol.springbookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class SpringBookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBookServiceApplication.class, args);
    }

}
