package com.stanzaliving.core.cafe.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

	private static List<EnumListing<CafeFeedbackFor>> feedbackEnumListing = new ArrayList<>();

	static {

		for (CafeFeedbackFor cafeFeedbackFor : CafeFeedbackFor.values()) {

			feedbackForMap.put(cafeFeedbackFor.getFeedbackFor(), cafeFeedbackFor);

			feedbackEnumListing.add(EnumListing.of(cafeFeedbackFor, cafeFeedbackFor.getFeedbackFor()));

		}
	}

	public static Map<String, CafeFeedbackFor> getFeedbackForMap() {
		return feedbackForMap;
	}

	public static CafeFeedbackFor getByName(String feedbackForName) {
		return feedbackForMap.get(feedbackForName);
	}

	public static List<EnumListing<CafeFeedbackFor>> getListing() {
		return feedbackEnumListing;
	}
}
