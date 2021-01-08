package me.hangyeol.springbookservice.container.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Section1. IoC 컨테이너와 빈
 * 5부 : Bean 의 Scope
 * Proto Scope 은 매번 새로운 Instance 를 만든다.
 * proxyMode 는 해당 Bean 을 Proxy 기반의 타입으로 감싼다.
 * 왜냐하면 Single 에서 ProtoType 의 Bean 을 직접 참조하면 호출시 매번 생성되지 않기 때문이다.
 */
@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Proto {

    // Proto Scope 에서 Single Scope 을 사용하는 것은 문제가 없다.
    private final Single single;

    public Proto(Single single) {
        this.single = single;
    }

}
