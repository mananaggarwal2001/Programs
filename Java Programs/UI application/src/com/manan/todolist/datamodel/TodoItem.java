package com.manan.todolist.datamodel;

import java.time.LocalDate;

public class TodoItem {
    private String shortdescription;
    private String details;
    private LocalDate deadline;

    public TodoItem(String shortdescription, String details, LocalDate deadline) {
        this.shortdescription = shortdescription;
        this.details = details;
        this.deadline = deadline;
    }

    public String getShortdescription() {
        return shortdescription;
    }

    public void setShortdescription(String shortdescription) {
        this.shortdescription = shortdescription;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return shortdescription;
    }
}
