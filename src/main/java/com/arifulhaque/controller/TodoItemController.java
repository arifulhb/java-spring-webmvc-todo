package com.arifulhaque.controller;

import com.arifulhaque.model.TodoData;
import com.arifulhaque.model.TodoItem;
import com.arifulhaque.service.TodoItemService;
import com.arifulhaque.util.AttributeNames;
import com.arifulhaque.util.Mappings;
import com.arifulhaque.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Slf4j
@Controller
public class TodoItemController {

    // == fields ==
    private final TodoItemService todoItemService;

    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    // == model attribute  ==
    @ModelAttribute
    public TodoData todoData () {

        return todoItemService.getData();
    }


    // == handler methods ==
    // http://localhost:800/todo-mvc/items
    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }

    @GetMapping(Mappings.ADD_ITEMS)
    public String addEditItem(Model model) {
        TodoItem todoItem = new TodoItem(1, "", "", LocalDate.now());
        model.addAttribute(AttributeNames.TODO_ITEM, todoItem);

        return ViewNames.ITEMS_ADD;
    }

    @PostMapping(Mappings.ADD_ITEMS)
    public String processItem(@ModelAttribute(AttributeNames.TODO_ITEM) TodoItem todoItem) {
        log.info("todoItem from from = {}", todoItem);
        todoItemService.addItem(todoItem);
        return "redirect:/" + Mappings.ITEMS;
    }

    @GetMapping(Mappings.DELETE_ITEMS)
    public String deleteItem(@RequestParam int id) {

        log.info("Deleting item with id={}", id);
        todoItemService.removeItem(id);

        return "redirect:/" + Mappings.ITEMS;
    }
}
