package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class AcquiredBooleanService extends BooleanService {
	private Integer items;
	private String acquisition;
	private Double monthlyRentalPerItem;
}
