package com.book.io.dto.filter;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorFilter {

    private Long authorId;
    private String firstName;
    private String lastName;
    private Boolean isActive;

}
