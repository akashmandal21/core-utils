package com.stanzaliving.transformations.pojo;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentFilterDto {
	@Default
	private List<String> cityUuid = new ArrayList<>();
	@Default
	private List<String> micromarketUuid = new ArrayList<>();
	@Default
	private List<String> residenceUuid = new ArrayList<>();
}
