package com.example.Widmiddleware.Repository;

import com.example.Widmiddleware.mysql.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, String> {
}
