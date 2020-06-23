package com.stanzaliving.operations.dto.servicemix;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Meal extends BooleanService {
	private int days;
	private List<String> time;
}
