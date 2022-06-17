package com.book.io.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "books")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Long id;
    private String bookName;
    private String description;
    private List<Page> pages;
    private Boolean isActive;

}
