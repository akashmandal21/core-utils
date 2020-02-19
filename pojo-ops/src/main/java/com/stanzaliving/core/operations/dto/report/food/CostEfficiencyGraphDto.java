package com.stanzaliving.core.operations.dto.report.food;

import java.util.List;

import com.stanzaliving.core.operations.dto.report.GraphDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class CostEfficiencyGraphDto extends GraphDto {

	private List<CostGraphFeElementDto> extraInformation;
}