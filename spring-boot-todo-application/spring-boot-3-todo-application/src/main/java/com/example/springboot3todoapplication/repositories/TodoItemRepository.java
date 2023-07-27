package com.example.springboot3todoapplication.repositories;

import com.example.springboot3todoapplication.models.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends JpaRepository<ToDoItem,Long> {

}
