package com.example.springboot3todoapplication.repositories;

import com.example.springboot3todoapplication.models.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersModel,Integer> {

    Optional<UsersModel> findByLoginAndPassword(String login, String password);

}
