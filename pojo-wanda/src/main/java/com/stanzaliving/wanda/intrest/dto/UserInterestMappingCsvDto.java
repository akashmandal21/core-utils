package com.stanzaliving.wanda.intrest.dto;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserInterestMappingCsvDto {
	
	@CsvBindByName(column = "id")
	@CsvBindByPosition(position = 0)
	private String id;

	@CsvBindByName(column = "userCode")
	@CsvBindByPosition(position = 1)
	private String userCode;
	
	@CsvBindByName(column = "userUuid")
	@CsvBindByPosition(position = 2)
	private String userUuid;
	
	@CsvBindByName(column = "residentName")
	@CsvBindByPosition(position = 3)
	private String residentName;
	
	@CsvBindByName(column = "residentEmail")
	@CsvBindByPosition(position = 4)
	private String residentEmail;
	
	@CsvBindByName(column = "residentMobileNumber")
	@CsvBindByPosition(position = 5)
	private String residentMobileNumber;
	
	@CsvBindByName(column = "residentGender")
	@CsvBindByPosition(position = 6)
	private String residentGender;
	
	@CsvBindByName(column = "residenceName")
	@CsvBindByPosition(position = 7)
	private String residenceName;
	
	@CsvBindByName(column = "microMarketName")
	@CsvBindByPosition(position = 8)
	private String microMarketName;
	
	@CsvBindByName(column = "cityName")
	@CsvBindByPosition(position = 9)
	private String cityName;
	
	@CsvBindByName(column = "responseTimestamp")
	@CsvBindByPosition(position = 10)
	private String responseTimestamp;
	
	@CsvBindByName(column = "categories")
	@CsvBindByPosition(position = 11)
	private String categories;
	
	@CsvBindByName(column = "interests")
	@CsvBindByPosition(position = 12)
	private String interests;
}
