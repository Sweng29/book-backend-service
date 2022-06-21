package com.book.io.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "page_lines")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String arabicLine;
    private String urduLine;
    private String englishLine;
    private String englishPronunciation;
    @ManyToOne
    @JoinColumn(name = "page_id")
    private Page page;
    private Boolean isActive;

}
