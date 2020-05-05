package me.hangyeol.springbookservice.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * BookService -> BookRepository
 */
@Service
public class BookService {


    //    @Qualifier("hangyeolBookRepository")
    //    private List<BookRepository> bookRepositories;
    @Autowired
    private BookRepository bookRepository;

//    @Autowired(required = false)
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;

//    @Autowired
//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

//    public void printBookRepository() {
//        this.bookRepositories.forEach(System.out::println);
//        System.out.println(bookRepository.getClass());
//    }

    @PostConstruct
    public void setUp() {
        System.out.println(bookRepository.getClass());
    }
}
