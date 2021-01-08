package me.hangyeol.springbookservice.container.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Section1. IoC 컨테이너와 빈
 * 6부 : Environment Profile
 * Bean 설정 파일에 추가하는 것 말고도, @Profile 에 해당 profile 값을 주면 같은 성능으로 사용할 수 있다.
 * @Profile("!prod") 의 형태로 연산자를 값으로 주어 사용할 수도 있다.
 */
@Repository
@Profile("test")
public class TestBookRepository implements TestProfileRepository {
}
