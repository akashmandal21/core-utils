package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NightCurfew extends BooleanService {
	private String timing;
}
