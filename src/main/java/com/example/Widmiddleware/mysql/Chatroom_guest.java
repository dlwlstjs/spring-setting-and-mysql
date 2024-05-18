package com.example.Widmiddleware.mysql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Chatroom_guest")
public class Chatroom_guest {
    @Id
    private String chat_id;
    private int email;
    private String chatroom_id;
}
