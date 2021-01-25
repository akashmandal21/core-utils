package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.SuppliesEnum;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Supplies extends BooleanService {
	private SuppliesEnum repetition;
}
