package com.book.io.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private List<BookDTO> bookDTOList;
    private Boolean isActive;

}
