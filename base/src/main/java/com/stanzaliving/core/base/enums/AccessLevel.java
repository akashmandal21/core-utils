/**
 * 
 */
package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author naveen.kumar
 *
 * @date 14-Nov-2019
 *
 **/
@Getter
@AllArgsConstructor
public enum AccessLevel {

	RESIDENCE(10),
	MICROMARKET(20),
	CITY(30),
	REGION(40),
	COUNTRY(50),
	GLOBAL(60),

	//keep level num 0 for locationAcl
	FOOD_VENDOR(0),
	CAFE(0),
	USER(0);

	public static final List<AccessLevel> locationAccessLevelList;

	static {
		locationAccessLevelList = Arrays.stream(AccessLevel.values()).filter(accessLevel -> accessLevel.getLevelNum() == 0).collect(Collectors.toList());
	}

	private int levelNum;

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