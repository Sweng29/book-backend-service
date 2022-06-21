package com.book.io.controller;

import com.book.io.dto.AuthorDTO;
import com.book.io.dto.BookDTO;
import com.book.io.dto.filter.AuthorFilter;
import com.book.io.dto.filter.BookFilter;
import com.book.io.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping(path = {"", "/", "/all"})
    public ResponseEntity<List<AuthorDTO>> fetchAllAuthors(AuthorFilter authorFilter)
    {
        return ResponseEntity.ok(authorService.findAllAuthors(authorFilter));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorDTO> fetchAuthorById(@PathVariable(name = "id") Long id)
    {
        return ResponseEntity.ok(authorService.findAuthorById(id));
    }

}
