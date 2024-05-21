package com.example.Widmiddleware.mysql;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
@Table(name = "Chat")
public class Chat {
    @Id
    private int chat_id;
    private String email;
    @ManyToOne
    @JoinColumn(name = "chatroom_id", nullable = false, columnDefinition = "int")
    Chatroom chatroom_id;
    @Column(length = 500)
    private String chatting;
    private Date chat_time;
}
