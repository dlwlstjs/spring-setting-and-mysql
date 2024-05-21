package com.example.Widmiddleware.mysql;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Friend")
public class Friend {
    @Id
    private int request_id;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "email"),
            @JoinColumn(name = "enauk")
    })
    Users email;
    Users friend_email;
    private Status status;
}