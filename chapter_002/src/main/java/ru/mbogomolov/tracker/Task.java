package ru.mbogomolov.tracker;

/**
 * Task class creates new request.
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 */

public class Task {
    private String id;
    private String name;
    private String description;
    private long create;
    private String comment;

    public Task() {
    }

    public Task(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }
    public Task(String name, String description, long create, String comment) {
        this.name = name;
        this.description = description;
        this.create = create;
        this.comment = comment;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public long getCreate() {
        return this.create;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreate(long create) {
        this.create = create;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
