package com.book.io.service.impl;

import com.book.io.dto.AuthorDTO;
import com.book.io.dto.filter.AuthorFilter;
import com.book.io.exception.DataNotFoundException;
import com.book.io.exception.error.ErrorCode;
import com.book.io.exception.error.ErrorMessage;
import com.book.io.mapper.AuthorMapper;
import com.book.io.repository.AuthorRepository;
import com.book.io.service.AuthorService;
import com.book.io.specification.AuthorSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<AuthorDTO> findAllAuthors(AuthorFilter authorFilter) {
        return AuthorMapper.map(authorRepository.findAll(AuthorSpecification.findAll(authorFilter)));
    }

    @Override
    public AuthorDTO findAuthorById(Long id) {
        return AuthorMapper.map(authorRepository.findById(id)
                .orElseThrow(()-> new DataNotFoundException(ErrorCode.INVALID_ID, ErrorMessage.INVALID_ID)));
    }
}
