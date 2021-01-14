package me.hangyeol.springbookservice.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Section5. Spring AOP
 * Aspect : 구현할 모듈을 묶은 단위
 * Advice : 해야할 일
 * Target : 적용이 되는 대상
 * Pointcut : 적용할 지점 (어디에 적용해야 하는지)
 * JoinPoint : 구체적인 실행 시점
 */
@Aspect
@Component
public class PerformanceAspect {

//    @Around("execution(* me.hangyeol.springbookservice.aop.EventService.*(..))")
    @Around("@annotation(PerfLogging)")
//    @Around("bean(simpleEventService)")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;
    }

    @Before("bean(simpleEventService)")
    public void hello() {
        System.out.println("hello");
    }
}

