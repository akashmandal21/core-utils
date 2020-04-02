/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class CreatedBetweenDateRange {

	private Date startDate;
	private Date endDate;
}
