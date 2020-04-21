/**
 * 
 */
package com.stanzaliving.core.base.enums;

import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 14-Nov-2019
 *
 **/
@Getter
public enum AccessLevel {

	RESIDENCE(10),
	MICROMARKET(20),
	CITY(30),
	REGION(40),
	COUNTRY(50),
	GLOBAL(60);

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

	public boolean isHigher(AccessLevel other) {
		return this.levelNum > other.levelNum;
	}
}