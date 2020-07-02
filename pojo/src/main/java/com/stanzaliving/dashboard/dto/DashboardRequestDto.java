package com.stanzaliving.dashboard.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.log4j.Log4j2;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Log4j2
public class DashboardRequestDto implements Cloneable {

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