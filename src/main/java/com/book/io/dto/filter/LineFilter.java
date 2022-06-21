package com.book.io.dto.filter;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LineFilter {
    private Long lineId;
    private Long bookId;
    private Long pageId;
}
