package com.stanzaliving.transformations.pojo;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.transformations.pojo.AddStanzaClusterDto;

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
public class UpdateZoneForStanzaCityDto {
	
	
	private UIKeyValue zone;
	
	private List<UIKeyValue> stanzaCities;
	private List<StanzaCityAndZone> rows;
	private List<UIKeyValue> zoneOptions;
}
