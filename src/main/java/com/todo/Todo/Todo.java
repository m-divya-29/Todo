package com.todo.Todo;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Todo {

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    private String username;
    private int id;
    @Size(min = 3, message = "Input at least 3 characters")
    private String title;
    @Size(min = 5, message = "Input at least 5 characters")
    private String description;
    @FutureOrPresent(message = "Enter today or a future date")
    private LocalDate targetDate;
    private LocalDate createdDate;
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
