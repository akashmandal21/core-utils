package com.stanzaliving.core.opscalculator.v1.dto;

import java.util.Map;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class NucleusRateMasterDto extends AbstractDto  {

	private static final long serialVersionUID = 1L;
	
	@NotNull(message = "config can't be null")
	private Map<String, Object> nrmConfig;
}
