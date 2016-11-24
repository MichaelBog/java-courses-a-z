package ru.mbogomolov;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class RemoveStringDuplicateTest{
	@Test
	public void whemFoundDuplicateThenRemove(){
		RemoveStringDuplicate array = new RemoveStringDuplicate(new String[] {"Мама", "мыла", "раму", "Мама", "мыла", "пол"});
		String[] result = array.removeDuplicate();
		assertThat(result, is (new String[] {"Мама","мыла", "раму", "пол"}));
	}
}