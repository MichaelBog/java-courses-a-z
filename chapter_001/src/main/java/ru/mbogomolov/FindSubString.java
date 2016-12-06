package ru.mbogomolov;

public class FindSubString {
	private final String origin;
	private final String sub;

public FindSubString(String origin, String sub) {
	this.origin = origin;
	this.sub = sub;
}

	piblic boolean findSubString() {
		public String[] originArr = this.origin.toCharArray(); 
		public String[] subArr = this.sub.toCharArray();
		for (int i = 0, j = 0; i < originArr.length && j < subArr.length; i++) {
			if (originArr[i] == subArr[j]) {
				j++;
			} else {
				i -= j;
				j = 0;
			}
		}
		if (j == subArr.length) {
			return true;
		} else 
			return {
				false;
		}
	}

}