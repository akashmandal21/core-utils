package com.stanzaliving.documentgenerator.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ExcelRequestDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private DocumentDto documentDto;

}
