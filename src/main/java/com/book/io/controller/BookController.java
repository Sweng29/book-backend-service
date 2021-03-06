package com.book.io.controller;

import com.book.io.dto.BookDTO;
import com.book.io.dto.filter.BookFilter;
import com.book.io.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(path = {"", "/", "/all"})
    public ResponseEntity<List<BookDTO>> fetchAllBooks(BookFilter bookFilter)
    {
        return ResponseEntity.ok(bookService.findAllBooks(bookFilter));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> fetchBookById(@PathVariable(name = "id") Long id)
    {
        return ResponseEntity.ok(bookService.findBookById(id));
    }

}
