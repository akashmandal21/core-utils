/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import com.stanzaliving.core.estate.enums.EstateStatus;
import com.stanzaliving.core.utilservice.annotations.DateCompare;
import lombok.*;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@Builder
@Data
public class CompetitionStatusFilter {

	private boolean enabled;
	private String displayText;
	private int count;
}
