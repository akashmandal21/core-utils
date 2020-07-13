package com.stanzaliving.core.food.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Map;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 06-July-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TemplateData {
	private String templateData;
}
