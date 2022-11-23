package com.stanzaliving.transformations.ui.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country {

	private String countryName;

	private Long id;

	private String uuid;

	private List<State> states;

}
