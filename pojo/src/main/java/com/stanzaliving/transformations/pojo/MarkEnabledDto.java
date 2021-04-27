package com.stanzaliving.transformations.pojo;

import java.io.Serializable;
import java.util.List;

import com.stanzaliving.banner.enumeration.SectionType;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.transformations.enums.Section;
import com.stanzaliving.transformations.pojo.ZoneUIDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarkEnabledDto {
	
	private Boolean enabled;
	
	private Section section;
	
	private List<UIKeyValue> stanzaCity;
	
	private List<UIKeyValue> stanzaCluster;
	
	
	

}
