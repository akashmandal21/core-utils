package com.stanzaliving.core.generic.po.grn;

import java.time.LocalDateTime;

import com.stanzaliving.core.generic.po.enums.PoStatusEnum;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericPoUpdate {

	private String poUuid;
	
	private PoStatusEnum poStatus;
	
	private Boolean underShortCloseCycle;
	
	private Boolean underCancelCycle;
	
	private Boolean approved;
	
	private LocalDateTime lastUpdatedAt;
	
	private String eventUuid;

}
