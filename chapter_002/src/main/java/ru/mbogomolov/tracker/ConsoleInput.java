package ru.mbogomolov.tracker;

import java.util.Scanner;

/**
 * This class implement user input from console.
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 * @version $Id$
 */
public class ConsoleInput implements Input {
    /**
     * Create object scanner for console input.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Implementation Input ask method.
     * @param question - String question
     * @return String line from console
     */
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
    public int userAction() {
        return Integer.parseInt(scanner.nextLine());
    }
}
