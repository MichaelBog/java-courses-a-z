package ru.mbogomolov.tracker;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Tests for all method by Tracker class.
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 */

public class TrackerTest {
    /**
     * pre-created data for tests.
     */
    Task taskTest;
    Task taskTest1;
    Task taskTest2;
    Tracker trackerTest;
    Task[] tasksTestArray;

    /**
     * pre-created data for tests.
     * create Task objects and Tracker object
     * test addTask method
     */
    @Before
    public void dataForTests() {
        this.taskTest = new Task("Cat", "Clean the cat", 1555);
        this.taskTest1 = new Task("Dog", "Feed the dog", 1600);
        this.taskTest2 = new Task("Fish", "Talk with fish", 1605);
        this.tasksTestArray = new Task[] {this.taskTest, this.taskTest1, this.taskTest2};
        this.trackerTest = new Tracker();
        for (int i = 0; i < this.tasksTestArray.length; i++) {
            this.trackerTest.addTask(this.tasksTestArray[i]);
        }
    }

    /**
     * test addTask method.
     * test getAll method
     */
    @Test
    public void whenAddTaskThenFillArray() {
        assertArrayEquals(this.tasksTestArray, this.trackerTest.getAll());
    }

    /**
     * test addTask method.
     */
    @Test
    public void whenAddNewTaskThenCheck() {
        Task result = new Task();
        this.trackerTest.addTask(result);
        assertNotNull(result);
    }

    /**
     * test removeTask method.
     */
    @Test
    public void whenRemoveTaskThenNullCell() {
        Task[] result = new Task[] {null, taskTest1, taskTest2};
        this.trackerTest.removeTask(taskTest);
        assertArrayEquals(result, this.trackerTest.getAll());
    }

    /**
     * test updateTask method.
     * test edit name
     */
    @Test
    public void whenEditNameThenUpdatedTask() {
        this.taskTest.setName(this.taskTest1.getName());
        this.trackerTest.updateTask(this.taskTest);
        assertThat(taskTest.getName(), is(taskTest1.getName()));
    }

    /**
     * test updateTask method.
     * test edit description
     */
    @Test
    public void whenEditDescriptionThenUpdateTask() {
        this.taskTest2.setDescription(this.taskTest1.getDescription());
        this.trackerTest.updateTask(this.taskTest2);
        assertThat(taskTest2.getDescription(), is(taskTest1.getDescription()));
    }

    /**
     * test updateTask method.
     * test edit creation
     */
    @Test
    public void whenEditCreationThenUpdateTask() {
        this.taskTest1.setCreate(this.taskTest.getCreate());
        this.trackerTest.updateTask(this.taskTest1);
        assertThat(taskTest1.getCreate(), is(taskTest.getCreate()));
    }

    /**
     * test addComment method.
     */
    @Test
    public void whenAddCommentThenAdd() {
        Task result = new Task("Robot", "Repair him", 2100, "done");
        this.trackerTest.addComment(this.taskTest.getId(), result.getComment());
        assertThat(this.taskTest.getComment(), is(result.getComment()));
    }

    /**
     * test getById method.
     */
    @Test
    public void whenFindByIdThenShow() {
        assertEquals(this.taskTest, trackerTest.getById(taskTest.getId()));
    }

    /**
     * test getById method with null.
     */
    @Test
    public void whenFindByIdNullThenBreak() {
        trackerTest.removeTask(taskTest);
        assertEquals(null, trackerTest.getById(taskTest.getId()));
    }

    /**
     * test getByName method.
     */
    @Test
    public void whenFindByNameThenShow() {
        assertEquals(this.taskTest, trackerTest.getByName(taskTest.getName()));
    }
}
