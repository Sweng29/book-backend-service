package com.book.io.mapper;

import com.book.io.dto.AuthorDTO;
import com.book.io.entity.Author;
import org.springframework.util.ObjectUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public interface AuthorMapper {

    static AuthorDTO map(Author author) {
        if(ObjectUtils.isEmpty(author))
            return null;
        return AuthorDTO
                .builder()
                .id(author.getId())
                .firstName(author.getFirstName())
                .lastName(author.getLastName())
                //.bookDTOList(BookMapper.map(author.getBookList()))
                .isActive(author.getIsActive())
                .build();
    }

    static List<AuthorDTO> map(List<Author> authors) {
        if (authors.isEmpty())
            return Collections.emptyList();
        return authors.stream().map(AuthorMapper::map).collect(Collectors.toList());
    }

}
