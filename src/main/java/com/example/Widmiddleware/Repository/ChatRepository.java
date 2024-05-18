package com.example.Widmiddleware.Repository;

import com.example.Widmiddleware.mysql.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Integer> {
}

