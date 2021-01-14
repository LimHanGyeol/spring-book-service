package me.hangyeol.springbookservice.resourceabstraction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

/**
 * Section2. Resource / Validation
 * Validation 추상화
 * 강의에서 하는 이런식의 방법은 원시적인 방법이다.
 */
@Component
public class ValidatorRunner implements ApplicationRunner {

    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===== validate =====");
        System.out.println(validator.getClass());

        Event event = new Event(1, "title", -1, "aaa2");

        // 스프링 부트에 등록된 Bean Validation 을 사용하기 위해 EventValidator 를 주석 처리한다.
        // EventValidator eventValidator = new EventValidator();
        Errors errors = new BeanPropertyBindingResult(event, "event");

        // eventValidator.validate(event, errors);
        validator.validate(event, errors);

        System.out.println(errors.hasErrors());

        errors.getAllErrors().forEach(error -> {
            System.out.println("===== error code ====");

            Arrays.stream(error.getCodes())
                    .forEach(System.out::println);

            System.out.println(error.getDefaultMessage());
        });

    }
}
