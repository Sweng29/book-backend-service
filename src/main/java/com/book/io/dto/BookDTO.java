package com.book.io.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    private Long bookId;
    private String bookName;
    @JsonIgnore
    private List<AuthorDTO> authors;
    private Boolean isActive;

}
