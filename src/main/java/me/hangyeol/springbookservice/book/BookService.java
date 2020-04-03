package me.hangyeol.springbookservice.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BookService -> BookRepository
 */
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
