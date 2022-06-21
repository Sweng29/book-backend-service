package com.book.io.service.impl;

import com.book.io.dto.BookDTO;
import com.book.io.dto.filter.BookFilter;
import com.book.io.exception.DataNotFoundException;
import com.book.io.exception.error.ErrorCode;
import com.book.io.exception.error.ErrorMessage;
import com.book.io.mapper.BookMapper;
import com.book.io.repository.BookRepository;
import com.book.io.service.BookService;
import com.book.io.specification.BookSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookDTO> findAllBooks(BookFilter bookFilter) {
        return BookMapper.map(bookRepository.findAll(BookSpecification.findAll(bookFilter)));
    }

    @Override
    public BookDTO findBookById(Long bookId) {
        return BookMapper.map(bookRepository.findById(bookId)
                .orElseThrow(()-> new DataNotFoundException(ErrorCode.INVALID_ID, ErrorMessage.INVALID_ID)));
    }

}
