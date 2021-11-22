package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Keshav Singh
 * @date 11/22/2021
 **/
@Getter
@AllArgsConstructor
public enum ContestType {

	INDIVIDUAL("Individual"),MATCH("Match");

	private static final SortedMap<String, ContestType> contestTypeMap = new TreeMap<String, ContestType>();

	static {
		for (ContestType  contestType : ContestType.values()) {
			contestTypeMap.put(contestType.getContestTypeName(), contestType);
		}
	}

	private final String contestTypeName;

	public static Collection<ContestType> getContestType() {
		return contestTypeMap.values();
	}
}
