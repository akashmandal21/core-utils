package com.stanzaliving.operations.dto.servicemix;

import lombok.Setter;
import lombok.ToString;

import java.util.List;

import lombok.Getter;

@Getter
@Setter
@ToString(callSuper = true)
public class MultiTimeSlotService extends BooleanService {
	private List<List<String>> timing;
}
