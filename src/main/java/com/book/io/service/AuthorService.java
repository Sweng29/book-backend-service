package com.book.io.service;

import com.book.io.dto.AuthorDTO;
import com.book.io.dto.filter.AuthorFilter;

import java.util.List;

public interface AuthorService {

    List<AuthorDTO> findAllAuthors(AuthorFilter authorFilter);
    AuthorDTO findAuthorById(Long id);

}
