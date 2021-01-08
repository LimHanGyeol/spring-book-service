package me.hangyeol.springbookservice.container.environment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Section1. IoC 컨테이너와 빈
 * 6부 : Environment Profile
 * TestBookRepository Bean 은 test Profile 일 때에만 사용이 된다.
 */
@Configuration
// @Profile("test")
public class TestConfiguration {

    //@Bean
    //public TestBookRepository testBookRepository() {
    //  return new TestBookRepository();
    //}

}
