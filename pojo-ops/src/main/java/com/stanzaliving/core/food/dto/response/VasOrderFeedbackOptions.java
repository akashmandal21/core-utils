package com.stanzaliving.core.food.dto.response;

import java.util.List;
import java.util.Map;

import com.stanzaliving.core.cafe.enums.CafeFeedbackFor;
import com.stanzaliving.core.food.dto.ResidentMealFeedbackOptions;
import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 26-Nov-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class VasOrderFeedbackOptions {

	private String userId;

	private String masterOrderId;

	private String foodOrderId;

	private List<EnumListing<CafeFeedbackFor>> feedbackFor;

	private List<VasOrderItemFeedbackOptions> itemFeedbackOptions;

	private Map<Integer, List<ResidentMealFeedbackOptions>> ratingWiseMealFeedbackOptions;

}