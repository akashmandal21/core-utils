package com.stanzaliving.transformations.ui.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class State implements Serializable {
	
	private String stateName;
	
	private Long id;
	
	private String uuid;

	private List<City> cities;

}
