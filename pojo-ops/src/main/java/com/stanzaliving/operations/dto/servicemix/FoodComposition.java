package com.stanzaliving.operations.dto.servicemix;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodComposition extends BooleanService {
	private List<Tag> tags;
}
