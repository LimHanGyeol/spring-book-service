package me.hangyeol.springbookservice.container.scope;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

/**
 * Section1. IoC 컨테이너와 빈
 * 5부 : Bean 의 Scope
 */
@Component
public class Single {

    // Single Scope 은 Application 이 Initialization 될 때 1번만 Instance 가 생성이 된다.
    // 이때 ProtoType 의 Property 도 세팅이 된다. 그래서 Singleton Type 의 Bean 을 계속 쓰더라도
    // ProtoType 의 Bean Property 가 변경이 되지 않는다. Proto 가 아니게 되어 문제이다.
    private Proto proto;

    // proxyMode 를 제외하고 protoType Scope 을 사용할 수 있는 방법.
    // Spring Code 의 의존성이 생기기 때문에 개인적으로 선호되진 않는다고 한다.
    // private ObjectProvider<Proto> proto;

    public Single(Proto proto) {
        this.proto = proto;
    }

    public Proto getProto() {
        return proto;
    }

}
