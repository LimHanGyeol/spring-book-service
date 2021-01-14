package me.hangyeol.springbookservice.aop;

import java.lang.annotation.*;

/**
 * Section5. Spring AOP
 * 이 어노테이션을 사용하면 성능을 로깅해 줍니다.
 * RetentionPolicy : 해당 어노테이션의 정보를 얼마나 유지할 것 인가.
 * CLASS 는 .clsss 파일까지 유지하겠다라는 의미이다.
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface PerfLogging {
}
