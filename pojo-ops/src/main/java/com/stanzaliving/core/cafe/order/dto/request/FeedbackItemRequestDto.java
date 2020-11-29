package com.stanzaliving.core.cafe.order.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
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
public class FeedbackItemRequestDto {


	@NotBlank(message = "Item selected is not valid")
	private String itemId;

	private List<String> feedbackOptionId;

}
