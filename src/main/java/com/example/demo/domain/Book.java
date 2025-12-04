package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long bookId;
    private String title;
    private String content;
    private String author;

    @Column(name = "view_cnt")
    private Long viewCnt = 0L;

    @Column(name = "reg_time")
    private LocalDate regTime;

    @Column(name = "update_time")
    private LocalDate updateTime;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Image> images = new ArrayList<>();

    // 나중에 좋아요 기능 생기면 주석풀기
    //@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    //@JsonManagedReference
    //private List<Like> likes = new ArrayList<>();
}
