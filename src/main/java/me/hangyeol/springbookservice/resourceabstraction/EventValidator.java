package me.hangyeol.springbookservice.resourceabstraction;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Section2. Resource / Validation
 * Validation 추상화
 */
public class EventValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Event.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "notempty", "Empty title is now allowed.");

        // ValidationUtils 없이 validate 메서드에서도 처리할 수 있다.
        // 하지만 최근에는 이렇게 validator 를 만들어 사용하지 않는다.
        // 스프링 부트 2.0.5 이상 버전을 사용할 시 LocalValidatorFactoryBean 을 자동으로 등록 해준다.
        // 그리고 Bean Validation 구현체로 hibernate validator 를 사용한다.
        // Event event = (Event) target;
        // if (event.getTitle() == null) {
        // errors.reject();
        // }
    }
}
