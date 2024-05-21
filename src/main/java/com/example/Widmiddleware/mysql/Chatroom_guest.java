package com.example.Widmiddleware.mysql;

import jakarta.persistence.*;
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
    @ManyToOne
    @JoinColumn(name = "chatroom_id", nullable = false, columnDefinition = "chatroom_id")
    Chatroom chatroom_id;
}
