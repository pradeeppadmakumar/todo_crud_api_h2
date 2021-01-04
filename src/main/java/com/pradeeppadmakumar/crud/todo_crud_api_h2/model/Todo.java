package com.pradeeppadmakumar.crud.todo_crud_api_h2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    Long id;

    String task;

    String description;

    String username;

    Boolean done;

    Date completionTimestamp;

    Date createdTimestamp;

    Date reminderTimestamp;

    public Todo(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Date getCompletionTimestamp() {
        return completionTimestamp;
    }

    public void setCompletionTimestamp(Date completionTimestamp) {
        this.completionTimestamp = completionTimestamp;
    }

    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public Date getReminderTimestamp() {
        return reminderTimestamp;
    }

    public void setReminderTimestamp(Date reminderTimestamp) {
        this.reminderTimestamp = reminderTimestamp;
    }

    public Todo(Long id, String task, String description, String username, Boolean done, Date createdTimestamp, Date reminderTimestamp) {
        this.id = id;
        this.task = task;
        this.description = description;
        this.username = username;
        this.done = done;
        this.createdTimestamp = createdTimestamp;
        this.reminderTimestamp = reminderTimestamp;
    }
}
