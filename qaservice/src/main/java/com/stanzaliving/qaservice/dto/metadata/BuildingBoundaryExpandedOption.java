package com.stanzaliving.qaservice.dto.metadata;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.qaservice.dto.QuestionResponseDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuildingBoundaryExpandedOption {

	Boolean isMandatory;
	List<QuestionResponseDto> questions = new ArrayList<>();

	public BuildingBoundaryExpandedOption(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
}