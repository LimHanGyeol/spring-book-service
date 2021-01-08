package me.hangyeol.springbookservice.container.service;

import me.hangyeol.springbookservice.container.domain.Book;
import me.hangyeol.springbookservice.container.domain.BookRepository;
import me.hangyeol.springbookservice.container.domain.BookStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

/**
 * <p>Section1. IoC 컨테이너와 빈</p>
 * 3부 : @Autowire
 */
@Service
public class BookService {

    // @Autowired TODO : field 에 @Autowired 를 선언하여 주입할 수 있다. 역시 required 옵션을 사용할 수 있다.
    // @Qualifier("hangyeolBookRepository") TODO : 스몰케이스를 이용하여 특정 Bean 의 Id 를 주입하여 특정할 수 있다.
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // @Autowired(required = false) TODO : required = false 로 의존성의 여부를 Optional 로 지정할 수 있다.
    // public void setBookRepository(BookRepository bookRepository) {
    //     this.bookRepository = bookRepository;
    // }

    public Book save(Book book) {
        book.setCreated(new Date());
        book.setBookStatus(BookStatus.DRAFT);
        return bookRepository.save(book);
    }

    @PostConstruct // Bean 인스턴스가 만들어진 이후 부가적인 작업을 정의한다.
    public void postConstruct() {
        System.out.println("=========================");
        System.out.println("PostConstruct");
    }

}
