package ru.mbogomolov.tracker;

/**
 * Task class creates new request.
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 */

public class Task {
    /**
     * Tasks id.
     */
    private String id;

    /**
     * Tasks name.
     */
    private String name;

    /**
     * Tasks description.
     */
    private String description;

    /**
     * Tasks creation time.
     */
    private long create;

    /**
     * Tasks comment.
     */
    private String comment;

    /**
     * Constructor for Task without args.
     */
    public Task() {
    }

    /**
     * Constructor for Task.
     * @param name
     * @param description
     * @param create
     */
    public Task(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    /**
     * Constructor for Task.
     * @param name
     * @param description
     * @param create
     * @param comment
     */

    public Task(String name, String description, long create, String comment) {
        this.name = name;
        this.description = description;
        this.create = create;
        this.comment = comment;
    }

    /**
     * Getters and setters for all class fields.
     * @return fields
     */
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
