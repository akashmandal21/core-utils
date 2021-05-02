package com.stanzaliving.transformations.pojo;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.generic.dto.UIKeyValue;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StanzaCityPostDto {
	private String cityName;
	private Boolean status;
	private String zone;
	private List<UIKeyValue> stanzaClusters;
	private List<UIKeyValue> zones;

	
	

	
}










