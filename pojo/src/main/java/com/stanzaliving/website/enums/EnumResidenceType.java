package com.stanzaliving.website.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum EnumResidenceType {

	SCHOLAR("Scholar", 1),
	SUIT("Suit", 2);

	private Integer residenceTypeId;
	private String typeName;

	private static final Map<Integer, EnumResidenceType> byResidenceTypeId = new HashMap<Integer, EnumResidenceType>();
	private static final Map<String, EnumResidenceType> byTypeName = new HashMap<String, EnumResidenceType>();

	static {
		for (EnumResidenceType e : EnumResidenceType.values()) {
			if (byResidenceTypeId.put(e.getResidenceTypeId(), e) != null) {
				throw new IllegalArgumentException("duplicate id: " + e.getResidenceTypeId());
			}
		}
	}

	static {
		for (EnumResidenceType e : EnumResidenceType.values()) {
			if (byTypeName.put(e.getTypeName(), e) != null) {
				throw new IllegalArgumentException("duplicate id: " + e.getTypeName());
			}
		}
	}

	public static Map<String, EnumResidenceType> getByTypeName() {
		return byTypeName;
	}

	public static EnumResidenceType getByResidenceTypeId(int residenceTypeId) {
		return byResidenceTypeId.get(residenceTypeId);
	}

	public static EnumResidenceType getByTypeName(String typeName) {
		return byTypeName.get(typeName);
	}

	public static Map<Integer, EnumResidenceType> getByResidenceTypeId() {
		return byResidenceTypeId;
	}

	public static Map<Integer, EnumResidenceType> getByresidencetypeid() {
		return byResidenceTypeId;
	}

	public static Map<String, EnumResidenceType> getBytypename() {
		return byTypeName;
	}

	private EnumResidenceType(String typeName, Integer residenceTypeId) {
		this.residenceTypeId = residenceTypeId;
		this.typeName = typeName;
	}
}
