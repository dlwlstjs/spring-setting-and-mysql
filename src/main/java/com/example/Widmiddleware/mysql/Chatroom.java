package com.example.Widmiddleware.mysql;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Chatroom")
public class Chatroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chatroom_id", nullable = false, columnDefinition = "int")
    private int chatroom_id; //외래키(chat, chatroom_id)
    private String email;
    @Column(length = 50, nullable = false)
    private String chatroom_title;
}
