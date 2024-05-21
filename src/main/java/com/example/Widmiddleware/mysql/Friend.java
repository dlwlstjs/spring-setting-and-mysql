package com.example.Widmiddleware.mysql;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Friend")
public class Friend {
    @Id @GeneratedValue
    private int request_id;
    @ManyToOne
    @JoinColumn(name = "email", nullable = false)
    Users email;
    @ManyToOne
    @JoinColumn(name = "friend_email", nullable = false)
    Users friend_email;
    private Status status;
}