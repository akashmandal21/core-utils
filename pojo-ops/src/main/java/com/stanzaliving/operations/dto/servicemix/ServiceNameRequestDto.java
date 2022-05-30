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
public class ServiceNameRequestDto implements Serializable {
	
	private static final long serialVersionUID = -781001708415567640L;

	private List<String> residenceIds;

}
