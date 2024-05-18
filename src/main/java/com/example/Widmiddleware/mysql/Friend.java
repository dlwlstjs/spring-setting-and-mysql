package com.example.Widmiddleware.mysql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Friend")
public class Friend {
    @Id
    private int request_id;
    private String email;
    private String friend_email;
    private Status status;
}
