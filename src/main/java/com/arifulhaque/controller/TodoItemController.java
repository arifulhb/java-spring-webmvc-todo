package com.arifulhaque.controller;

import com.arifulhaque.model.TodoData;
import com.arifulhaque.util.Mappings;
import com.arifulhaque.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TodoItemController {

    // == model attribute  ==
    @ModelAttribute
    public TodoData todoData () {
        return new TodoData();
    }


    // == handler methods ==
    // http://localhost:800/todo-mvc/items
    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }

}
