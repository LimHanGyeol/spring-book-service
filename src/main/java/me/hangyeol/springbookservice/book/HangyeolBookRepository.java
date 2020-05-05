package me.hangyeol.springbookservice.book;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class HangyeolBookRepository implements BookRepository{
}
