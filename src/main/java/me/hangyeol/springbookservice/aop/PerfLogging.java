package me.hangyeol.springbookservice.aop;

import java.lang.annotation.*;

/**
 * Section5. Spring AOP
 * 이 어노테이션을 사용하면 성능을 로깅해 줍니다.
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface PerfLogging {
}
