package com.stanzaliving.core.generic.po.grn;

import java.time.LocalDateTime;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericPoUpdate {

	private String poUuid;
	
	private GenericPOTOStatus poStatus;
	
	private LocalDateTime lastUpdatedAt;
	
	private String eventUuid;
	
	private Department department;

}
