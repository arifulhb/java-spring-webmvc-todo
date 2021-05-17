package com.arifulhaque.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {
    // == fields ==
    private static int idValue = 1;
    private final List<TodoItem> items = new ArrayList<>();

    // == constructor ==
    public TodoData() {
        // add some dummy data using the addItem method
        addItem(new TodoItem(1, "first task", "Work Hard",  LocalDate.now()));
        addItem(new TodoItem(2, "second task", "Work Hard",  LocalDate.now()));
        addItem(new TodoItem(3, "Third task", "Work Hard",  LocalDate.now()));
        addItem(new TodoItem(4, "forth task", "Work Hard",  LocalDate.now()));
    }

    // public methods

    /**
     *
     * @return Collection
     */
    public List<TodoItem> getItems () {
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NonNull TodoItem toAdd) {
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }

    public void removeItem(@NonNull int id) {
        ListIterator<TodoItem> itemIterator = items.listIterator();

        while (itemIterator.hasNext()) {
            TodoItem item = itemIterator.next();

            if (item.getId() == id) {
               itemIterator.remove();
               break;
            }
        }
    }

    public TodoItem getItem(@NonNull int id) {
        for(TodoItem item: items) {
            if (item.getId() == id) {
                return  item;
            }
        }
        return  null;
    }

    public void updateItem(@NonNull TodoItem toUpdate) {
        ListIterator<TodoItem> itemListIterator = items.listIterator();

        while (itemListIterator.hasNext()) {
            TodoItem item = itemListIterator.next();

            if (item.equals(toUpdate)) {
                itemListIterator.set(toUpdate);
                break;
            }
        }
    }
}
