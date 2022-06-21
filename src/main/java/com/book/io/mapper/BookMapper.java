package com.book.io.mapper;

import com.book.io.dto.BookDTO;
import com.book.io.entity.Book;
import org.springframework.util.ObjectUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public interface BookMapper {


    static BookDTO map(Book book) {
        if (ObjectUtils.isEmpty(book))
            return null;
        return BookDTO
                .builder()
                .bookName(book.getBookName())
                .bookId(book.getId())
                .isActive(book.getIsActive())
                .authors(AuthorMapper.map(book.getAuthors()))
                .build();
    }

    static List<BookDTO> map(List<Book> bookList) {
        if (bookList.isEmpty())
            return Collections.emptyList();
        return bookList.stream().map(BookMapper::map).collect(Collectors.toList());
    }

}
