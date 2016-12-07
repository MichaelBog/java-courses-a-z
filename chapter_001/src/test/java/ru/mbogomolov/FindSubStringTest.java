package ru.mbogomolov;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class FindSubStringTest {
	@Test
	public void whenFindSubStringThenSignalTrue() {
		FindSubString findSub = new FindSubString("водоворот", "рот");
		boolean result = findSub.findSubString();
		assertThat(result, is(true));
	}
	@Test
	public void whenFindSubStringThenSignalFalse() {
		FindSubString findSub = new FindSubString("поворот", "кот");
		boolean result = findSub.findSubString();
		assertThat(result, is(false));
	}
}