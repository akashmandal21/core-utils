/**
 * 
 */
package com.stanzaliving.core.base.enums;

/**
 * @author naveen.kumar
 *
 * @date 14-Nov-2019
 *
 **/
public enum AccessLevel {

	GLOBAL(5),
	COUNTRY(10),
	REGION(15),
	CITY(20),
	MICROMARKET(25),
	RESIDENCE(30);

	private int levelNum;

	AccessLevel(int levelNum) {
		this.levelNum = levelNum;
	}

	public boolean isLower(AccessLevel other) {
		return this.levelNum < other.levelNum;
	}

	public boolean isHigherOrEqual(AccessLevel other) {
		return this.levelNum >= other.levelNum;
	}
}