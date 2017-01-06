package ru.mbogomolov.tracker;

/**
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 * @version $Id$
 */
public interface Input {
    /**
     * method asks the user to choose next action.
     * @param question - String question
     * @return String
     */
    String ask(String question);
}
