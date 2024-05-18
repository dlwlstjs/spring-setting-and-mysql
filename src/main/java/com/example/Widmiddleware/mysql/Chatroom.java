package com.example.Widmiddleware.mysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Chatroom")
public class Chatroom {
    @Id
    private int chatroom_id;
    private String email;
    @Column(length = 50, nullable = false)
    private String chatroom_title;
}
