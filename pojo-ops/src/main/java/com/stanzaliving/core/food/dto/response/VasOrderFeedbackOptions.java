package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.cafe.enums.CafeFeedbackFor;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

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

	private String masterOrderId;

	private List<EnumListing<CafeFeedbackFor>> feedbackFor;

	private List<VasOrderItemFeedbackOptions> itemFeedbackOptions;

}
