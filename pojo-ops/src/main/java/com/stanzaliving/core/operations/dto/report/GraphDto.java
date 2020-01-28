package com.stanzaliving.core.operations.dto.report;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class GraphDto {

	private String chartTitle;
	private String xLabel;
	private String yLabel;
	private String xType;
	private String yType;
	private AccessLevel accessLevel;
	private List<GraphLineXPoint> xAxis = new ArrayList<>();
	private List<GraphLineDto> yAxis = new ArrayList<>();
}