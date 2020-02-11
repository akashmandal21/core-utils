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
import lombok.extern.log4j.Log4j2;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Log4j2
public class ReportRequestDto implements Cloneable {

	private List<String> cityUuid;

	private List<String> micromarketUuid;

	private List<String> residenceUuid;

	private LocalDate startDate;

	private LocalDate endDate;

	private AccessLevel accessLevel;

	protected Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			log.error("Getting CloneNotSupportedException ", e);
			throw new RuntimeException(e);
		}
	}

}