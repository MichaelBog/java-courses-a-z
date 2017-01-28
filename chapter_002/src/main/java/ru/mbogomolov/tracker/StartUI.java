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
        Tracker tracker = new Tracker();
        showUserMenu();
        while (true) {
            String welcome = input.ask("Please choose the action");
            if (welcome.equals("1")) {
                String name = input.ask("Please create a new task name");
                String description = input.ask("Please create description");
                long creationTime = 0000;
                tracker.addTask(new Task(name, description, creationTime));
                showUserMenu();
            } else if (welcome.equals("2")) {
                String name = input.ask("Enter removed task name");
                tracker.removeTask(tracker.getByName(name));
            } else if (welcome.equals("3")) {
                String name = input.ask("Enter updated task name");
                tracker.updateTask(tracker.getByName(name));
            } else if (welcome.equals("4")) {
                String id = input.ask("Enter tasks id");
                String comment = input.ask("Enter comment");
                tracker.addComment(id, comment);
            } else if (welcome.equals("5")) {
                try {
                    for (Task task : tracker.getAll()) {
                        System.out.println(task.getName());
                    }
                } catch (NullPointerException exception) {
                    System.out.println("Another tasks were deleted");
                }
            } else if (welcome.equals("6")) {
                String id = input.ask("Enter id for search");
                System.out.println(tracker.getById(id).getName());
            } else if (welcome.equals("7")) {
                String name = input.ask("Enter name for search");
                System.out.println(tracker.getByName(name).getName());
            } else if (welcome.equals("8")) {
                System.out.println("Goodbye");
                break;
            }
        }
    }

    /**
     * Method shown menu for users actions.
     */
    public void showUserMenu() {
        System.out.println("1 - add new task");
        System.out.println("2 - remove task");
        System.out.println("3 - update task");
        System.out.println("4 - add comment");
        System.out.println("5 - get all task");
        System.out.println("6 - get task by id");
        System.out.println("7 - get task by name");
        System.out.println("8 - exit");
    }

}
