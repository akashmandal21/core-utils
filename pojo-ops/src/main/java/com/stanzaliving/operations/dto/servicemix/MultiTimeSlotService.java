package com.stanzaliving.operations.dto.servicemix;

import lombok.Setter;

import java.util.List;

import lombok.Getter;

@Getter
@Setter
public class MultiTimeSlotService extends BooleanService {
	private List<List<String>> timing;
}
