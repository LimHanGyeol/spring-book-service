package me.hangyeol.springbookservice.container.domain;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * <p>Section1. IoC 컨테이너와 빈</p>
 * 3부 : @Autowire
 * @Primary 어노테이션으로 n개의 Bean 을 등록할 경우 주입할 Bean 을 특정할 수 있다.
 */
@Primary
@Repository
public class HangyeolBookRepository implements BookRepository {

    public Book save(Book book) {
        return null;
    }
}
