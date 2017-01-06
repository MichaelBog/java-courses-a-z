package ru.mbogomolov.tracker;

/**
 * Class for test StartUI and StubInput.
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 * @version $Id$
 */
public class StartUITest {

    /**
     * Enter point uses StubInput for test.
     * @param args - args
     */
    public static void main(String[] args) {
        Input input = new StubInput(new String[] {"create stub task"});
        new StartUI(input).init();
    }
}
