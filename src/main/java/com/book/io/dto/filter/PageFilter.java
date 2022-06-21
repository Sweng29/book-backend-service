package com.book.io.dto.filter;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageFilter {

    private Long pageId;
    private Long bookId;
}
