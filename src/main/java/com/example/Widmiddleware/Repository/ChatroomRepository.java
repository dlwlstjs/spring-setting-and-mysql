package com.example.Widmiddleware.Repository;

import com.example.Widmiddleware.mysql.Chatroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatroomRepository extends JpaRepository<Chatroom, Integer> {
}

