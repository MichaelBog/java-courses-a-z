package ru.mbogomolov;
/**
 * Find substring from original.
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 * @version 2
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
		int j = 0;
		int i = 0;
		char[] originArr = this.origin.toCharArray();
		char[] subArr = this.sub.toCharArray();
		while (i < originArr.length && j < subArr.length) {
		if (originArr[i] == subArr[j]) {
                j++;
                i++;
            } else {
				i++;
				i -= j;
				j = 0;
			}
		}
			return j == subArr.length;
    }
}