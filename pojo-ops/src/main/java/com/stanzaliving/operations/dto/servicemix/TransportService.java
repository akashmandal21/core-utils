package com.stanzaliving.operations.dto.servicemix;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class TransportService extends BooleanService {
	private Transport transport = new Transport();
}
