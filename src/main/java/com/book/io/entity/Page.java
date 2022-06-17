package com.book.io.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "pages")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Page {

    private Long id;
    private Book book;
    private List<Line> lines;
    private Boolean isActive;

}
