package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tag extends BooleanService {
	private String uuid;
	private int repetition;
}
