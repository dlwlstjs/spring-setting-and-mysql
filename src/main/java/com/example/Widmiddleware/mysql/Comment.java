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
@Table(name = "Comment")
public class Comment {
    @Id
    private int Comment_id;
    private int post_id;
    private String email;
    @Column(length = 300)
    private String comment;
    private Date comment_date;
}
