package com.example.Widmiddleware.mysql;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "Users")
public class Users {
    @Id
    @Column(length = 320, nullable = false, columnDefinition = "String")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String email; //외래키 연결(friend, chatroom, post, comment, email)
    @Column(length = 20, nullable = false)
    private String nickname;
    @Column(length = 30, nullable = false)
    private String password;

    private LocalDate contact_date;
    @Lob
    private byte[] user_img;
    @Column(length = 300)
    private LocalDate user_comment;
    private StatusCategory category;
}
