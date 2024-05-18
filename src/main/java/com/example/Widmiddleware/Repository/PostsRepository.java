package com.example.Widmiddleware.Repository;

import com.example.Widmiddleware.mysql.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Integer> {

}
