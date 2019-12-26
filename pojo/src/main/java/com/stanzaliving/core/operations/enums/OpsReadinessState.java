/**
 * 
 */
package com.stanzaliving.core.operations.enums;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 14-Nov-2019
 *
 **/
@Getter
public enum OpsReadinessState {

	DELAYED("Delayed"),
	DUE("Due in {days} Days"),
	NEW("Newly Added"),
	LIVE("Already Live");

	private String stateName;

	private OpsReadinessState(String stateName) {
		this.stateName = stateName;
	}

	private static Map<String, String> opsReadinessMap = new HashMap<>();

	static {

		for (OpsReadinessState opsReadinessState : OpsReadinessState.values()) {
			opsReadinessMap.put(opsReadinessState.name(), opsReadinessState.getStateName());
		}
	}

	public static Map<String, String> getReadinessValues() {
		return opsReadinessMap;
	}

	public static Set<OpsReadinessState> getCityReadinessStates() {

		Set<OpsReadinessState> readinessStates = new HashSet<>();

		readinessStates.add(NEW);
		readinessStates.add(LIVE);

		return readinessStates;
	}

	public static Set<OpsReadinessState> getMicromarketReadinessStates() {

		Set<OpsReadinessState> readinessStates = new HashSet<>();

		readinessStates.add(NEW);
		readinessStates.add(LIVE);

		return readinessStates;
	}

	public static Set<OpsReadinessState> getResidenceReadinessStates() {

		Set<OpsReadinessState> readinessStates = new HashSet<>();

		readinessStates.add(NEW);
		readinessStates.add(LIVE);
		readinessStates.add(DUE);
		readinessStates.add(DELAYED);

		return readinessStates;
	}

}