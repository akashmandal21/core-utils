package com.stanzaliving.core.opscalculatorv2.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.opscalculator.dto.DropDownDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HouseKeepingType {
	PREMIUM("Premium"), NORMAL("Normal");

	String hkTypeName;

	public static List<DropDownDto> getAllHkTypeValues() {
		return hkDropDownDtoList;
	}

	static List<DropDownDto> hkDropDownDtoList = new ArrayList<>();

	static {
		for (HouseKeepingType type : HouseKeepingType.values()) {
			hkDropDownDtoList.add(new DropDownDto(type.toString(), type.getHkTypeName()));
		}
	}
}

