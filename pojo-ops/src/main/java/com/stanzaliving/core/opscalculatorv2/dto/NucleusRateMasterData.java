package com.stanzaliving.core.opscalculatorv2.dto;

import java.io.Serializable;
import java.util.List;

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
public class NucleusRateMasterData implements Serializable  {
		
	private static final long serialVersionUID = 1L;
	
	private List<NucleusRateMasterDataConfig> nucleusRateMasterDataConfig;
	
}
