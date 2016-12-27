package ru.mbogomolov.tracker;

import java.util.Random;

/**
 * Tracker class - storage for request.
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 */
public class Tracker {

    /**
     * possible number of Tasks in array.
     */
    private final int numberForTask = 100;

    /**
     * array for Task storage.
     */
    private Task[] tasks = new Task[numberForTask];

    /**
     * position for Task in array for correct adding.
     */
    private int position = 0;

    /**
     * create the random for correct generateId method.
     */
    private static final Random RN = new Random();

    /**
     * method add new task.
     * @param task - task
     * @return task
     */
    public Task addTask(Task task) {
        task.setId(this.generateId());
        this.tasks[position++] = task;
        return task;
    }

    /**
     * method remove task.
     * @param task - task
     */
    public void removeTask(Task task) {
        if (task != null) {
            for (int i = 0; i < this.tasks.length; i++) {
                if (this.tasks[i].equals(task)) {
                    this.tasks[i] = null;
                    break;
                }
            }
        }
    }

    /**
     * method update task.
     * @param task - task
     */
    public void updateTask(Task task) {
        for (int i = 0; i < this.tasks.length; i++) {
            if (this.tasks[i].getId().equals(task.getId())) {
                this.tasks[i] = task;
                break;
            }
        }
    }

    /**
     * add comment for task.
     * @param id - id
     * @param comment - comment
     */
    public void addComment(String id, String comment) {
        for (int i = 0; i < this.tasks.length; i++) {
            if (this.tasks[i].getId().equals(id)) {
                this.tasks[i].setComment(comment);
                break;
            }
        }
    }

    /**
     * method generate unique random id.
     * @return String format id
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * shown all tasks.
     * @return Task[]
     */
    public Task[] getAll() {
        Task[] result = new Task[position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.tasks[index];
        }
        return result;
    }

    /**
     * find task by id.
     * @param id - id
     * @return task(result)
     */
    public Task getById(String id) {
        Task result = null;
        for (int i = 0; i < this.tasks.length; i++) {
            if (this.tasks[i] != null && this.tasks[i].getId().equals(id)) {
                result = this.tasks[i];
                break;
            }
        }
        return result;
    }

    /**
     * find task by name.
     * @param name - name
     * @return task(result)
     */
    public Task getByName(String name) {
        Task result = null;
        for (int i = 0; i < this.tasks.length; i++) {
            if (this.tasks[i] != null && this.tasks[i].getName().equals(name)) {
                result = this.tasks[i];
                break;
            }
        }
        return result;
    }
}