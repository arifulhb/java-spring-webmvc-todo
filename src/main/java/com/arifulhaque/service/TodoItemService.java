package com.arifulhaque.service;

import com.arifulhaque.model.TodoData;
import com.arifulhaque.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem toAdd);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem toUpdate);
    TodoData getData();
}
