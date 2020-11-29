package com.stanzaliving.core.cafe.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 28-Nov-2020
 */

@Getter
@AllArgsConstructor
public enum CafeFeedbackFor {

	PORTION("Portion") ,
	PACKAGING("Packaging");

	private String feedbackFor;

	private static Map<String, CafeFeedbackFor> feedbackForMap = new HashMap<>();

	static {

		for (CafeFeedbackFor cafeFeedbackFor : CafeFeedbackFor.values()) {

			feedbackForMap.put(cafeFeedbackFor.getFeedbackFor(), cafeFeedbackFor);

		}
	}

	public static Map<String, CafeFeedbackFor> getFeedbackForMap() {
		return feedbackForMap;
	}

	public static CafeFeedbackFor getByName(String feedbackForName) {
		return feedbackForMap.get(feedbackForName);
	}
}
