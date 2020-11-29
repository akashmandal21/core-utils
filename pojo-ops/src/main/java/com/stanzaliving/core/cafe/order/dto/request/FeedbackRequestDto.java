package com.stanzaliving.core.cafe.order.dto.request;

import com.stanzaliving.core.cafe.enums.CafeFeedbackFor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 28-Nov-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FeedbackRequestDto {

	@NotBlank(message = "Order selection is mandatory for feedback")
	private String orderId;

	@NotNull(message = "Rating selection is mandatory")
	private Integer rating;

	@NotNull(message = "Please select feedback entity")
	private CafeFeedbackFor feedbackFor;

	private String feedback;

	@Valid
	@NotEmpty(message = "Item selection for feedback is mandatory")
	private List<FeedbackItemRequestDto> itemFeedback;

}
