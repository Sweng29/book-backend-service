package com.book.io.dto.filter;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookFilter {

    private Long id;
    private String bookName;
    private String description;
    private String author;
    private Boolean isActive;

}
