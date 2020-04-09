/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DateRange {

	private Date startDate;
	private Date endDate;
}
