package me.hangyeol.springbookservice.container.domain;

import org.springframework.stereotype.Repository;

/**
 * <p>Section1. IoC 컨테이너와 빈</p>
 * 3부 : @Autowire
 * 상위 Bean 을 선언하고 구현체를 만들 때
 */
@Repository
public interface BookRepository {

    Book save(Book book);

}
