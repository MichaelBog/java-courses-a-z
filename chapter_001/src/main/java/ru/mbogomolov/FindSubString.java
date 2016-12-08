package ru.mbogomolov;
/**
 * Find substring from original.
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 * @version
*/

public class FindSubString {
	/**
    * Original string.
    */
    private final String origin;
    /**
    * Substring.
    */
	private final String sub;
    /**
    * Constructor.
    * @param origin origin
    * @param sub sub
    */
public FindSubString(String origin, String sub) {
	this.origin = origin;
	this.sub = sub;
}
    /**
    * Find substring from original.
    * @return boolean
    */
	public boolean findSubString() {
		int j;
		int i;
		char[] originArr = this.origin.toCharArray();
		char[] subArr = this.sub.toCharArray();
		for (i = 0, j = 0; i < originArr.length && j < subArr.length; i++) {
			if (originArr[i] == subArr[j]) {
                j++;
            } else {
				i -= j;
				j = 0;
			}
		}
			return j == subArr.length;
    }
}