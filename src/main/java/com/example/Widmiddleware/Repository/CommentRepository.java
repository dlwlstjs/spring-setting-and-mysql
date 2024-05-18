package com.example.Widmiddleware.Repository;

import com.example.Widmiddleware.mysql.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}

