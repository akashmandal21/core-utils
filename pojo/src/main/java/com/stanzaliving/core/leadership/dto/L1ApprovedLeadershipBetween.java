/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class L1ApprovedLeadershipBetween {

	private Date startDate;
	private Date endDate;
}
