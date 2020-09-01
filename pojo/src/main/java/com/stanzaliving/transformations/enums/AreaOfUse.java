/**
 * 
 */
package com.stanzaliving.transformations.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
public enum AreaOfUse {

	ROOM("Room"),
	RECEPTION("Reception"),
	ENTERTAINMENT("Entertainment"),
	BACK_OF_HOUSE("Back of House"),
	GAMING("Gaming"),
	CAFE_AREA("Cafe Area"),
	BRANDING("Branding"),
	ELECTRONIC("Electronic"),
	GYM("Gym"),
	COMMON_AREA("Common Area"),
	LOGISTICS("Logistics"),
	PROVISIONAL("Provisional");
	
	private String name;

	private AreaOfUse(String name) {
		this.name = name;
	}
	
	public static Map<String, AreaOfUse> areaofUseMap = new HashMap<>();

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
	}

}
