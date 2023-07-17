package com.stanzaliving.operations.dto.servicemix;

import java.io.Serializable;

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
public class ResidenceSubServiceDetailDto implements Serializable {

	private static final long serialVersionUID = -8340862625054886662L;

	private String name;
	
	private boolean enable;
	
}
