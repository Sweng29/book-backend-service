package com.book.io.controller;

import com.book.io.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/books")
public class BookController {

    @Autowired
    private BookService bookService;

}
