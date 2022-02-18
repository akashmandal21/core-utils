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
public class ResidenceServiceListDto implements Serializable {

	private static final long serialVersionUID = -5405034556008004862L;

	private String residenceUuid;

	private String residenceName;
	
	private List<ResidenceServiceDetailDto> residenceServiceDetailDto;
}
