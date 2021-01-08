package me.hangyeol.springbookservice.container;

import me.hangyeol.springbookservice.container.domain.Book;
import me.hangyeol.springbookservice.container.domain.BookRepository;
import me.hangyeol.springbookservice.container.domain.BookStatus;
import me.hangyeol.springbookservice.container.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    BookRepository bookRepository;

    @Test
    public void save() {
        Book book = new Book();

        when(bookRepository.save(book)).thenReturn(book);
        BookService bookService = new BookService(bookRepository);

        Book result = bookService.save(book);

        assertThat(result.getCreated()).isNotNull();
        assertThat(result.getBookStatus()).isEqualTo(BookStatus.DRAFT);
        assertThat(result).isNotNull();
    }

}
