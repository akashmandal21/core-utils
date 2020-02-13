package com.stanzaliving.core.projectservice.dto;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.commentsservice.dto.CommentsDto;
import com.stanzaliving.core.projectservice.enums.BedCountStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@SuperBuilder
@Getter
@ToString(callSuper = true)
@Setter
@NoArgsConstructor
public class BedCountDto extends AbstractDto implements Serializable{

	private static final long serialVersionUID = 14233523L;

	private String propertyUuid;
	
	private long cityId;
	
	private Integer bdBedCount;
	
	private Integer primaBedCount;
	
	private Integer designBedCount;
	
	private Integer designRoomCount;

	private Integer deviationInRoomCount;
		
	private BedCountStatus bedCountStatus;
	
	private Integer version;
	
	private List<CommentsDto> deviationReasons;
	
	private String bedCountStatusName;
	private String color;
}
