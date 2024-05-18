package com.example.Widmiddleware.mysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private int chatroom_id;
    @Column(length = 500)
    private String chatting;
    private Date chat_time;
}
