package com.stanzaliving.locator.aliases;


import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@SuperBuilder
public class CityAlias extends AbstractDto {
	private String city;

	private String alias;

	private String state;
//	private static final String BANGALORE = "bangalore";
//	private static final String MUMBAI = "mumbai";
//
//	public String getAlias(String aliasName) {
//		return _getAlias(aliasName);
//	}
//
//
//
//	private String _getAlias(String aliasName){
//		HashMap<String, String> cityMap = new HashMap<>();
//		cityMap.putAll(getBangaloreMap());
//		cityMap.putAll(getMumbaiMap());
//		return cityMap.get(aliasName);
//	}
//
//
//	private Map<String, String> getBangaloreMap(){
//		Map<String, String> bangaloreMap = new HashMap<>();
//		bangaloreMap.put("bangalore", BANGALORE);
//		bangaloreMap.put("bengaluru", BANGALORE);
//		return bangaloreMap;
//	}
//
//	private Map<String, String> getMumbaiMap(){
//		Map<String, String> mumbaiMap = new HashMap<>();
//		mumbaiMap.put("mumbai", MUMBAI);
//		mumbaiMap.put("bombay", MUMBAI);
//		return mumbaiMap;
//	}


}
