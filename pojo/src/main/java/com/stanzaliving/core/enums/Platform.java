package com.stanzaliving.core.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Platform {
	Android("android"), Ios("ios");
	
	private String platform;
	
	private static final Map<String, Platform> byPlatform = new HashMap<String, Platform>();
	
	static {
		for (Platform e : Platform.values()) {
			byPlatform.put(e.getPlatform(), e);
		}
	}
	
	public static boolean existsInPlatform(String platform) {
		return byPlatform.containsKey(platform);
	}

}

