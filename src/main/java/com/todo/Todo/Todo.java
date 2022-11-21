package com.todo.Todo;

import java.time.LocalDate;

public class Todo {


    private String username;
    private int id;
    private String title, description;
    private LocalDate targetDate, createdDate;
    private boolean finished;
    public String getUsername() {
        return username;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public boolean isFinished() {
        return finished;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "username="+ username +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", createdDate=" + createdDate +
                ", finished=" + finished +
                '}';
    }

    public Todo(int id, String username, String title, String description, LocalDate targetDate, LocalDate createdDate, boolean finished) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.targetDate = targetDate;
        this.createdDate = createdDate;
        this.finished = finished;
        this.username = username;
    }
}
