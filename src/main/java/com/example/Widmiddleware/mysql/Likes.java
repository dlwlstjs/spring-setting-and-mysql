package com.example.Widmiddleware.mysql;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Likes")
public class Likes {
    @Id @GeneratedValue
    private int request_id;
    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false, columnDefinition = "int")
    Posts post_id;
    private String email;
}
