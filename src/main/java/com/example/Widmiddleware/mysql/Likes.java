package com.example.Widmiddleware.mysql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Likes")
public class Likes {
    @Id
    private int request_id;
    private int post_id;
    private String email;
}
