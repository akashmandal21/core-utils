package com.stanzaliving.core.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum Platform {
	Android("android"), Ios("ios");
	
	private String platform;
	
	private static final Map<String, Platform> byPlatform = new HashMap<String, Platform>();
	
	static {
		for (Platform e : Platform.values()) {
			byPlatform.put(e.getPlatform(), e);
		}
	}
	
	private Platform(String platform) {
		this.platform = platform;
	}
	
	public static boolean existsInPlatform(String platform) {
		return byPlatform.containsKey(platform);
	}

}

