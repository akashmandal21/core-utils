package com.stanzaliving.gamificationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Keshav Singh
 * @date 11/2/2021
 **/
@Getter
@AllArgsConstructor
public enum ContestStatus {

	APPROVE("APPROVE"),PENDING("PENDING"),REJECT("REJECT");

	private static final SortedMap<String, ContestStatus> contestStatusMap = new TreeMap<String, ContestStatus>();

	static {
		for (ContestStatus  contestStatus : ContestStatus.values()) {
			contestStatusMap.put(contestStatus.getContestStatusName(), contestStatus);
		}
	}

	private final String contestStatusName;

	public static Collection<ContestStatus> getContestStatus() {
		return contestStatusMap.values();
	}

}
