package com.book.io.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pages")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    @OneToMany(mappedBy = "page")
    private List<Line> lines;
    private Boolean isActive;

}
