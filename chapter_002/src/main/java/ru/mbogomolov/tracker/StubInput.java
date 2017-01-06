package ru.mbogomolov.tracker;

/**
 * This class uses for tests. Imitation user input.
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 * @version $Id$
 */
public class StubInput implements Input {
    /**
     * Array users answers.
     */
    private String[] answers;
    /**
     * Count and position user answer in array.
     */
    private int position = 0;

    /**
     * Constructor StabInput.
     * @param answers - answers
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Implementation Input ask method.
     * @param question - String question
     * @return Sting answer(array)
     */
    public String ask(String question) {
        return answers[position++];
    }
}
