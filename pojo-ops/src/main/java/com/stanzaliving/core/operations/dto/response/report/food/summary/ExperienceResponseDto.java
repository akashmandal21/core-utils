package com.stanzaliving.core.operations.dto.response.report.food.summary;

import com.stanzaliving.core.operations.dto.response.report.FeElementDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceResponseDto {

	private FeElementDto delighted;

	private FeElementDto dissatisfied;

	private FeElementDto disgusted;

	private FeElementDto socialMediaComplaint;

	private FeElementDto disasterEvent;

	private FeElementDto shortage;

}