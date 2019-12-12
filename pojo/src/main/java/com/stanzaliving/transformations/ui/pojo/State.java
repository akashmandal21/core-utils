package com.stanzaliving.transformations.ui.pojo;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class State {
	
	private String stateName;
	
	private Long id;
	
	private String uuid;

	private List<City> cities;

}
