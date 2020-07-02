package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.SuppliesEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Supplies extends BooleanService {
	private SuppliesEnum repetition;
}
