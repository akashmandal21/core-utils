package com.stanzaliving.core.electricity.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PostpaidResidentChargesSplitDto {
	private double residentShareTotal;
	private List<PostpaidResidentChargesSplitRow> postpaidResidentChargesSplitRows;
}