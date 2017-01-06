package ru.mbogomolov.tracker;

/**
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 * @version $Id$
 */
public class StartUI {

    /**
     * Field for user input.
     */
    private Input input;

    /**
     * Constructor for input initialization.
     * @param input - input
     */
    public StartUI(Input input) {
        this.input = input;
    }
    /**
     * main method - enter point, uses ConsoleInput.
     * @param args - args
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        new StartUI(input).init();
    }

    /**
     * Mehod for initialization user input from console.
     */
    public void init() {
        /**
        String name = input.ask("Please create a new task name");
        Tracker tracker = new Tracker();
        tracker.addTask(new Task(name, "First description", 0000));
        for (Task task : tracker.getAll()) {
            System.out.println(task.getName());

         */


        Tracker tracker = new Tracker();
        String welcome = input.ask("Please choose the action");
        if (input.ask(welcome).equals("1")) {
            String name = input.ask("Please create a new task name");
            String description = input.ask("Please add description");
            long creationTime = System.currentTimeMillis();
            tracker.addTask(new Task(name, description, creationTime));
            System.out.println(welcome);
        } else if (input.ask(welcome).equals("2")) {
            tracker.removeTask(tracker.getByName(input.ask("Enter removed task name")));
        } else if (input.ask(welcome).equals("3")) {
            tracker.addComment((input.ask("Enter Id")), input.ask("Enter comment"));
        } else if (input.ask(welcome).equals("4")) {
            System.out.println(tracker.getById(input.ask("Enter id")).getName());
        } else if (input.ask(welcome).equals("5")) {
            tracker.getByName(input.ask("Enter name"));
        } else if (input.ask(welcome).equals("6")) {
            for (Task task : tracker.getAll()) {
                System.out.println(task.getName());
            }
        } else if (input.ask(welcome).equals("7")) {
            System.out.println("Exit");
        }
    }

}
