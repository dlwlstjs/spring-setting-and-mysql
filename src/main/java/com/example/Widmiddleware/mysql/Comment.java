package com.example.Widmiddleware.mysql;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
@Table(name = "Comment")
public class Comment {
    @Id
    private int Comment_id;
    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false, columnDefinition = "int")
    Posts post_id;
    private String email;
    @Column(length = 300)
    private String comment;
    private Date comment_date;
}
