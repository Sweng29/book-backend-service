package com.book.io.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "lines")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Line {

    private Long id;
    private String arabicLine;
    private String urduLine;
    private String englishLine;
    private String englishPronunciation;
    private Book book;
    private Boolean isActive;

}
