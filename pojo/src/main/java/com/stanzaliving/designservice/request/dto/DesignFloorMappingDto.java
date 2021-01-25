package com.stanzaliving.designservice.request.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DesignFloorMappingDto {
	private String designFileUuid;
	private String filePath;
	private String fileName;
	private String fileExtension;
	private List<Integer> floors;
}