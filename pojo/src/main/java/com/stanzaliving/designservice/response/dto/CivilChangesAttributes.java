package com.stanzaliving.designservice.response.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class CivilChangesAttributes {
	
	private String civilChangeUuid;
	private String civilChange;
	private String remark;
	private boolean civilStatus;
	private boolean designTeamStatus;
	private Date updatedAt;
	private String updatedBy;
}