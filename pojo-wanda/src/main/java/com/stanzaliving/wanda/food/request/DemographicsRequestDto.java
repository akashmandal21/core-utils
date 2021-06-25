package com.stanzaliving.wanda.food.request;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
@SuperBuilder
public class DemographicsRequestDto {

	private Collection<String> hostelIdList;

}
