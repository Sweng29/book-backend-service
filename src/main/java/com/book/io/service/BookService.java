package com.book.io.service;

import com.book.io.dto.BookDTO;
import com.book.io.dto.filter.BookFilter;

import java.util.List;

public interface BookService {

    List<BookDTO> findAllBooks(BookFilter bookFilter);
    BookDTO findBookById(Long bookId);


}
