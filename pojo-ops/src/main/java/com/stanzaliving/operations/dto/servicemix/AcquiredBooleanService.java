package com.stanzaliving.operations.dto.servicemix;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AcquiredBooleanService extends BooleanService {
	private Integer items;
	private String acquisition;
	private Double monthlyRentalPerItem;
}
