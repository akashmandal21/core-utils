package com.stanzaliving.core.operations.dto.request.report;

import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.core.base.enums.AccessLevel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ReportRequestDto {

	private List<String> cityUuid;

	private List<String> micromarketUuid;

	private List<String> residenceUuid;

	private LocalDate startDate;

	private LocalDate endDate;

	private AccessLevel accessLevel;

}