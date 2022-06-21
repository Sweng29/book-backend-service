package com.book.io.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String bookName;
    private String description;
    @OneToMany(mappedBy = "book")
    private List<Page> pages;
    @ManyToMany(mappedBy = "bookList")
    private List<Author> authors;
    private Boolean isActive;

}
