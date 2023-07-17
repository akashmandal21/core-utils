package com.stanzaliving.operations.dto.servicemix;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class ResidenceServiceDetailDto implements Serializable {

	private static final long serialVersionUID = -2525132193390932959L;

	private String name;
	
	private boolean enable;

	private List<ResidenceSubServiceDetailDto> residenceSubServiceDetailDto;
	
}
