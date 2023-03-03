/**
 *
 */
package com.stanzaliving.transformations.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
public enum AreaOfUse {
	ROOM("Room", "#F9F3EE", "", false, false),
	RECEPTION("Reception", "#F6F6E2", "", false, false),
	ENTERTAINMENT("Entertainment", "#F45F71", "", true, false),
	BACK_OF_HOUSE("Back of House", "#D7DEEC", "", false, false),
	GAMING("Gaming", "#F6E2E2", "", false, true),
	CAFE_AREA("Cafe Area", "#FFC300", "", true, false),
	BRANDING("Branding", "#77baa6", "", true, false),
	ELECTRONIC("Electronic", "#e5e3e3", "", true, false),
	GYM("Gym", "#F3F3F3", "", false, true),
	COMMON_AREA("Common Area", "#F6E5F4", "", false, false),
	LOGISTICS("Logistics", "#e5e3e3", "", true, false),
	PROVISIONAL("Provisional", "#e5e3e3", "", true, false),
	REFURB("Refurb", "#77baa6", "", true, false),
	DINING("Dining Area", "#EFF9EE", "", false, true),
	CORRIDOR("Corridor", "#F9F3F8", "", false, false),
	KITCHEN("Kitchen", "#F3F3F3", "", false, true),
	LIFT("Lift", "#F3F3F3", "", false, false),
	STAIRS("Stairs", "#F3F3F3", "", false, false),
	UTILITY("Utility", "#F3F3F3", "", false, false),
	WASHROOM("Washroom", "#F3F3F3", "", false, false),
	FACADE("Facade", "#F3F3F3", "", false, false);

	private String name;
	private String color;
	private String image;
	private Boolean isDeprecated;
	private Boolean isCommonAreaIncluded;

	private AreaOfUse(String name, String color, String image, Boolean isDeprecated, Boolean isCommonAreaIncluded) {
		this.name = name;
		this.color = color;
		this.image = image;
		this.isDeprecated = isDeprecated;
		this.isCommonAreaIncluded = isCommonAreaIncluded;
	}

	public static Map<String, AreaOfUse> areaofUseMap = new HashMap<>();
	public static Map<String, AreaOfUse> areaofUseUpperCaseMap = new HashMap<>();
	public static final List<AreaOfUse> areaOfUseList = Arrays.asList(ROOM, RECEPTION, ENTERTAINMENT, BACK_OF_HOUSE,
			GAMING, CAFE_AREA, BRANDING, ELECTRONIC, GYM, COMMON_AREA, LOGISTICS, PROVISIONAL, REFURB, DINING, CORRIDOR, KITCHEN, LIFT, STAIRS, UTILITY, WASHROOM, FACADE);
	public static final List<AreaOfUse> commonAous = Arrays.asList(RECEPTION, ENTERTAINMENT, GAMING, GYM, COMMON_AREA,
			DINING, CORRIDOR, KITCHEN, LIFT, STAIRS, UTILITY, WASHROOM, CAFE_AREA, BACK_OF_HOUSE);

	static {
		areaofUseMap.put("Room", AreaOfUse.ROOM);
		areaofUseMap.put("Reception", AreaOfUse.RECEPTION);
		areaofUseMap.put("Entertainment", AreaOfUse.ENTERTAINMENT);
		areaofUseMap.put("Back of House", AreaOfUse.BACK_OF_HOUSE);
		areaofUseMap.put("Gaming", AreaOfUse.GAMING);
		areaofUseMap.put("Cafe Area", AreaOfUse.CAFE_AREA);
		areaofUseMap.put("Branding", AreaOfUse.BRANDING);
		areaofUseMap.put("Electronic", AreaOfUse.ELECTRONIC);
		areaofUseMap.put("Gym", AreaOfUse.GYM);
		areaofUseMap.put("Common Area", AreaOfUse.COMMON_AREA);
		areaofUseMap.put("Logistics", AreaOfUse.LOGISTICS);
		areaofUseMap.put("Provisional", AreaOfUse.PROVISIONAL);
		areaofUseMap.put("Refurb", AreaOfUse.REFURB);
		areaofUseMap.put("Dining Area", AreaOfUse.DINING);
		areaofUseMap.put("Corridor", AreaOfUse.CORRIDOR);
		areaofUseMap.put("Kitchen", AreaOfUse.KITCHEN);
		areaofUseMap.put("Lift", AreaOfUse.LIFT);
		areaofUseMap.put("Stairs", AreaOfUse.STAIRS);
		areaofUseMap.put("Utility", AreaOfUse.UTILITY);
		areaofUseMap.put("Washroom", AreaOfUse.WASHROOM);
		areaofUseMap.put("Facade", AreaOfUse.FACADE);

		Arrays.stream(AreaOfUse.values()).forEach(f->areaofUseUpperCaseMap.put(f.getName().toUpperCase(),f));
	}

	public static AreaOfUse getAreaOfUseByName(String name) {
		return areaofUseMap.get(name);
	}

}
