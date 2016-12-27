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
     * @param name - name
     * @param description - description
     * @param create - create
     */
    public Task(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    /**
     * Constructor for Task.
     * @param name - name
     * @param description - description
     * @param create - create
     * @param comment - comment
     */

    public Task(String name, String description, long create, String comment) {
        this.name = name;
        this.description = description;
        this.create = create;
        this.comment = comment;
    }

    /**
     * Constructor for Task.
     * @param id - id
     * @param name - name
     * @param description - description
     * @param create - create
     * @param comment - comment
     */
    public Task(String id, String name, String description, long create, String comment) {
        this.id = id;
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

    /**
     * getter for description.
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * getter for creation time.
     * @return create
     */
    public long getCreate() {
        return this.create;
    }

    /**
     * getter for id.
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * setter for id.
     * @param id - id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * setter for name.
     * @param name - name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * setter for description.
     * @param description - description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * setter for creation time.
     * @param create - create
     */
    public void setCreate(long create) {
        this.create = create;
    }

    /**
     * getter for comment.
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * setter for comment.
     * @param comment - comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
