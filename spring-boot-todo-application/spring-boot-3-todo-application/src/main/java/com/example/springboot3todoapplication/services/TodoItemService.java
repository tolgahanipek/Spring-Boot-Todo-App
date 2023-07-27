package com.example.springboot3todoapplication.services;

import com.example.springboot3todoapplication.models.ToDoItem;
import com.example.springboot3todoapplication.repositories.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class TodoItemService {

    @Autowired
    private TodoItemRepository todoItemRepository;

    public Iterable<ToDoItem> getAll(){
        return todoItemRepository.findAll();
    }

    public Optional<ToDoItem> getById(Long id){
        return todoItemRepository.findById(id);
    }

    public ToDoItem save(ToDoItem toDoItem){
        if(toDoItem.getId()==null){
            toDoItem.setCreatedAt(Instant.now());
        }
        toDoItem.setUpdatedAt(Instant.now());
        return todoItemRepository.save(toDoItem);
    }

    public  void delete(ToDoItem toDoItem){
        todoItemRepository.delete(toDoItem);
    }
}
