/**
 * 
 */
package com.stanzaliving.core.leaddashboard.dto;

import java.util.List;

import com.stanzaliving.core.leaddashboard.enums.GeographyViewEnum;
import com.stanzaliving.core.leaddashboard.enums.ParticularEnum;
import com.stanzaliving.core.leaddashboard.enums.PropertyTypeEnum;

import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
public class TodayReportRequestDto {

	private String date;
	private List<String> cities;
	private List<String> micromarkets;
	private List<String> residences;
	private GeographyViewEnum geographyView;
	private List<PropertyTypeEnum> propertyType;
	private ParticularEnum particular;
	private boolean replaceData;
	
}
