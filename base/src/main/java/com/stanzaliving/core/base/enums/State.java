/**
 * 
 */
package com.stanzaliving.core.base.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

/**
 * 
 * @author naveen
 *
 * @date 29-Sep-2019
 */
@Getter
public enum State {

	ANDMAN(1, "Andaman and Nicobar Islands", "AN", true),
	ANDHRA_PRADESH(2, "Andhra Pradesh", "AP", false),
	ARUNACHAL_PRADESH(3, "Arunachal Pradesh", "AR", false),
	ASSAM(4, "Assam", "AS", false),
	BIHAR(5, "Bihar", "BR", false),
	CHANDIGARH(6, "Chandigarh", "CH", true),
	CHHATTISGARH(7, "Chhattisgarh", "CT", false),
	DADRA_AND_NAGAR_HAVELI(8, "Dadra and Nagar Haveli", "DN", true),
	DAMAN_AND_DIU(9, "Daman and Diu", "DD", true),
	DELHI(10, "National Capital Territory of Delhi", "NC", true),
	GOA(11, "Goa", "GA", false),
	GUJRAT(12, "Gujarat", "GJ", false),
	HARYANA(13, "Haryana", "HR", false),
	HIMACHAL_PRADESH(14, "Himachal Pradesh", "HP", false),
	JAMMU_KASHMIR(15, "Jammu and Kashmir", "JK", false),
	JHARKHAND(16, "Jharkhand", "JH", false),
	KARNATAKA(17, "Karnataka", "KA", false),
	KERELA(18, "Kerala", "KL", false),
	LAKSHADWEEP(19, "Lakshadweep", "LD", true),
	MADHYA_PRADESH(20, "Madhya Pradesh", "MP", false),
	MAHARASHTRA(21, "Maharashtra", "MH", false),
	MANIPUR(22, "Manipur", "MN", false),
	MEGHALAYA(23, "Meghalaya", "ML", false),
	MIZORAM(24, "Mizoram", "MZ", false),
	NAGALAND(25, "Nagaland", "NL", false),
	ODISHA(26, "Odisha", "OR", false),
	PUDUCHERRY(27, "Puducherry", "PY", true),
	PUNJAB(28, "Punjab", "PB", false),
	RAJASTHAN(29, "Rajasthan", "RJ", false),
	SIKKIM(30, "Sikkim", "SK", false),
	TAMILNADU(31, "Tamil Nadu", "TN", false),
	TELANGANA(32, "Telangana", "TG", false),
	TRIPURA(33, "Tripura", "TR", false),
	UTTAR_PRADESH(34, "Uttar Pradesh", "UP", false),
	UTTARAKHAND(35, "Uttarakhand", "UT", false),
	WEST_BENGAL(36, "West Bengal", "WB", false);

	private int stateId;
	private String stateName;
	private String stateCode;
	private boolean unionTerritory;

	private static Map<Integer, State> statesByIdMap = new HashMap<>();
	private static Map<String, State> statesByNameMap = new HashMap<>();

	static {
		for (State state : State.values()) {
			statesByIdMap.put(state.getStateId(), state);

			statesByNameMap.put(state.getStateName(), state);
		}
	}

	State(int stateId, String stateName, String stateCode, boolean unionTerritory) {
		this.stateId = stateId;
		this.stateName = stateName;
		this.stateCode = stateCode;
		this.unionTerritory = unionTerritory;
	}

	public static State getStateById(int stateId) {
		return statesByIdMap.get(stateId);
	}

	public static String getStateName(int stateId) {
		State state = getStateById(stateId);

		if (state != null) {
			return state.getStateName();
		}

		return null;
	}

	public static String getStateCode(int stateId) {
		State state = getStateById(stateId);

		if (state != null) {
			return state.getStateCode();
		}

		return null;
	}

	public static boolean isUnionTerritory(int stateId) {
		State state = getStateById(stateId);

		if (state != null) {
			return state.isUnionTerritory();
		}

		return false;
	}

	public static State getStateByName(String stateName) {
		return statesByNameMap.get(stateName);
	}

	public static int getStateIdByName(String stateName) {
		State state = getStateByName(stateName);

		if (state != null) {
			return state.getStateId();
		}

		return 0;
	}

}