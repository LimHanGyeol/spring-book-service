package me.hangyeol.springbookservice.container.domain;

import org.springframework.stereotype.Repository;

/**
 * <p>Section1. IoC 컨테이너와 빈</p>
 * 3부 : @Autowire
 * 여러개의 Bean 주입
 */
@Repository
public class MyBookRepository implements BookRepository {

    public Book save(Book book) {
        return null;
    }

}
