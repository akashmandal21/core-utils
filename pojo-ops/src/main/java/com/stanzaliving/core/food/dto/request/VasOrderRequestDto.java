package com.stanzaliving.core.food.dto.request;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class VasOrderRequestDto {

	private List<VasOrderRequestDtoData> data;

	private String studentId;

	@NotNull(message = "Please specify residence id.")
	private String residenceId;

	@NotNull(message = "Please specify menu date.")
	private String menuDate;

}
