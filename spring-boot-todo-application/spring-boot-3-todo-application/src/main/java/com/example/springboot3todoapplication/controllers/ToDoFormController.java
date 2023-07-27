package com.example.springboot3todoapplication.controllers;

import com.example.springboot3todoapplication.models.ToDoItem;
import com.example.springboot3todoapplication.services.TodoItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class ToDoFormController {
    @Autowired
    private TodoItemService todoItemService;

    @GetMapping("/create-todo")
    public String showCreatedForm(ToDoItem toDoItem){
        return "new-todo-item";
    }

    @PostMapping("/todo")
    public String createTodoItem(@Valid ToDoItem toDoItem, BindingResult result, Model model){
        ToDoItem item=new ToDoItem();
        item.setDescription(toDoItem.getDescription());
        item.setIsComplete(toDoItem.getIsComplete());

        todoItemService.save(toDoItem);
        return "redirect:/t";
    }

    @GetMapping("/delete/{id}")
    public String deleteTodoItem(@PathVariable("id") Long id, Model model){
        ToDoItem toDoItem = todoItemService
                .getById(id)
                .orElseThrow(()-> new IllegalArgumentException("ToDoItem id: "+id+ "not found"));

        todoItemService.delete(toDoItem);
        return "redirect:/t";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model){
        ToDoItem toDoItem = todoItemService
                .getById(id)
                .orElseThrow(()-> new IllegalArgumentException("ToDoItem id: "+id+ "not found"));

        model.addAttribute("todo", toDoItem);
        return "edit-todo-item";

    }

    @PostMapping("/todo/{id}")
    public String updateTodoItem(@PathVariable("id") Long id, @Valid ToDoItem toDoItem, BindingResult result, Model model){

        ToDoItem item = todoItemService
                .getById(id)
                .orElseThrow(()-> new IllegalArgumentException("ToDoItem id: "+id+ "not found"));

        item.setIsComplete(toDoItem.getIsComplete());
        item.setDescription(toDoItem.getDescription());

        todoItemService.save(item);

        return "redirect:/t";

    }

}
