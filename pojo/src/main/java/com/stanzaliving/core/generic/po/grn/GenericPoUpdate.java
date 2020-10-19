package com.stanzaliving.core.generic.po.grn;

import java.time.LocalDateTime;

import com.stanzaliving.core.generic.po.enums.PoStatusEnum;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericPoUpdate {

	private String poUuid;
	
	private GenericPOTOStatus poStatus;
	
	private LocalDateTime lastUpdatedAt;
	
	private String eventUuid;

}
