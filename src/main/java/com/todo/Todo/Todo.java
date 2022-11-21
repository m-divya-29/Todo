package com.todo.Todo;

import java.time.LocalDate;

public class Todo {
    private int id;

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", createdDate=" + createdDate +
                ", finished=" + finished +
                '}';
    }

    private String title, description;
    private LocalDate targetDate, createdDate;
    private boolean finished;

    public Todo(int id, String title, String description, LocalDate targetDate, LocalDate createdDate, boolean finished) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.targetDate = targetDate;
        this.createdDate = createdDate;
        this.finished = finished;
    }
}
