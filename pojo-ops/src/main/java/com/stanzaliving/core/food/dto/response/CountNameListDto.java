package com.stanzaliving.core.food.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush srivastava
 *
 * @date 10-June-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CountNameListDto {
	private Integer count;

	private List<CountNameDto> nameWiseCount;
}
