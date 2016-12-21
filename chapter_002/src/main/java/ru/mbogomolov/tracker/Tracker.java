package ru.mbogomolov.tracker;

import java.util.Random;

/**
 * Tracker class - storage for request.
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 */
public class Tracker {
    private Task[] tasks = new Task[100];
    private int position = 0;
    private static final Random RN = new Random();

    /**
     * method add new task.
     * @param task
     * @return task
     */
    public Task addTask(Task task) {
        task.setId(this.generateId());
        this.tasks[position++] = task;
        return task;
    }

    /**
     * method remove task.
     * @param task
     */
    public void removeTask(Task task) {
        if (task != null) {
            for (Task result : this.tasks) {
                if (result.equals(task)) {
                    result = null;
                }
            }
        }
    }

    /**
     * method edit task name, description, creation time, comment.
     * @param task
     * @return Task[]
     */
    public Task[] editTask(Task task) {
        Task result = new Task();
        result.setName(task.getName());
        result.setDescription(task.getDescription());
        result.setCreate(task.getCreate());
        result.setComment(task.getComment());
        for (Task editTask : this.tasks) {
            if (editTask.equals(task)) {
                editTask = result;
            }
        }
        return this.tasks;
    }

    /**
     * add comment for task.
     * @param task
     * @return task
     */
    public Task addComment(Task task) {
        if (task.getComment().equals(null)) {
            task.setComment(task.getComment());
        }
        if (!task.getComment().equals(null)) {
            editTask(task);
        }
        return task;
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
     * @param id
     * @return task(result)
     */
    public Task getById(String id) {
        Task result = null;
        for (Task task : tasks) {
            if (task != null && task.getId().equals(id)) {
                result = task;
                break;
            }
        }
        return result;
    }

    /**
     * find task by name.
     * @param name
     * @return task(result)
     */
    public Task getByName(String name) {
        Task result = null;
        for (Task task : tasks) {
            if (task != null && task.getName().equals(name)) {
                result = task;
                break;
            }
        }
        return result;
    }
}
