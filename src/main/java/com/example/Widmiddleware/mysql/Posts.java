package com.example.Widmiddleware.mysql;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "Posts")
public class Posts {
    @Id @GeneratedValue
    @Column(name = "post_id", nullable = false, columnDefinition = "int")
    private int post_id; //외래키(comment, likes)
    private String email;
    @Column(length = 50, nullable = false)
    private String post_title;
    @Lob
    private byte[] post_img;
    private LocalDate post_date;
    private LocalDate end_date;
    private LocalDate start_date;
    private StatusCategory category;
    private StatusModifier modifier;
    private LocalDate post_description;
}
