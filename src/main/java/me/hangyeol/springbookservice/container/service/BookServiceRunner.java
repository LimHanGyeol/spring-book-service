package me.hangyeol.springbookservice.container.service;

import me.hangyeol.springbookservice.container.domain.BookRepository;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * <p>Section1. IoC 컨테이너와 빈</p>
 * 3부 : @Autowire
 * n개의 Bean 을 주입할 경우 어떤 것이 적용되는지 확인하기 위한 Runner
 */
@Component
public class BookServiceRunner implements ApplicationRunner {

    // n 개의 Bean 이 있을 경우 이름 지정으로도 해당 Bean 의 타입으로 주입할 수 있다. 권장되는 방법은 아니다.
    private final BookRepository myBookRepository;

    private final BookService bookService;

    private final ApplicationContext applicationContext;

    public BookServiceRunner(BookRepository myBookRepository,
                             BookService bookService,
                             ApplicationContext applicationContext) {
        this.myBookRepository = myBookRepository;
        this.bookService = bookService;
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        bookService.printBookRepository();
        AutowiredAnnotationBeanPostProcessor bean = applicationContext.getBean(AutowiredAnnotationBeanPostProcessor.class);
        System.out.println(bean);
    }

}
