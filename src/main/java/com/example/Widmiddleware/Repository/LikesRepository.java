package com.example.Widmiddleware.Repository;

import com.example.Widmiddleware.mysql.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikesRepository extends JpaRepository<Likes, Integer> {
}

