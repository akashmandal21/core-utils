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
public class ServiceNameResponseDto implements Serializable {

	private static final long serialVersionUID = -5977926103642650553L;

	private List<ResidenceServiceListDto> residenceServiceListDto;
}
