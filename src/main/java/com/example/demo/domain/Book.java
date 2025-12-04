package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;               // id (BIGINT)

    @Column(name = "reg_date")
    private LocalDate regDate;     // reg_date (DATE)

    @Column(name = "update_date")
    private LocalDate updateDate;  // update_date (DATE)

    private String title;          // title (VARCHAR)
    private String content;        // content (VARCHAR)

    private String author;         // author (VARCHAR)

    @Column(name = "image_id")
    private Long imageId;          // image_id (BIGINT)
}

