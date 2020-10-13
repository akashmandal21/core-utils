package com.stanzaliving.core.utility.dto;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true, exclude = { "image" })
public class ExpenseDto extends AbstractDto {

	private static final long serialVersionUID = 1230936259535791728L;

	@NotBlank(message = "Type Id Cannot be Blank")
	private String typeId;

	private String name;

	private Date time;

	private Double amount;

	@NotBlank(message = "Bill Photo is mandatory for expense")
	private String image;

	@NotEmpty(message = "Atleast 1 expense needs to be present")
	private List<@Valid ExpenseDetailsDto> details;
}