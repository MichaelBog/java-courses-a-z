package ru.mbogomolov.tracker;

/**
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 * @version $Id$
 */
public class StartUI {

    /**
     * main method - enter point.
     * @param args - args
     */
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.addTask(new Task("First task", "First description", 0000));
        for (Task task : tracker.getAll()) {
            System.out.println(task.getName());
        }
    }
}
