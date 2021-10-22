package com.stanzaliving.core.electricity.dto;

import java.util.List;

import com.stanzaliving.core.electricity.dto.bill.RoomDetailDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Studio21RoomWiseResidentDetailDto {

	private String residenceId;
	private String propertyCode;
	private List<RoomDetailDto> roomDetailDto;
		
}