package com.stanzaliving.core.property.dto;

import java.io.Serializable;
import java.util.Date;

import com.stanzaliving.core.user.dto.Address;
import com.stanzaliving.transformations.enums.BrandName;
import com.stanzaliving.transformations.enums.GenderAllowed;
import com.stanzaliving.transformations.enums.SubBrandName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * A DTO used for publishing Property details to kafka
 * which can be consume by SFR,OFR.....
 * 
 * @author debendra.dhinda
 * @since 28-Jan-2020
 * */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PropertyDetailsPublishDto implements Serializable{

	private static final long serialVersionUID = 4678413618693891713L;
	
	private String estateUuid;
	private String propertyUuid;
	private String propertyName;
	private Address propertyAddress;
	
	private String 	cityUuid;
	private String 	cityName;
	private Long 	cityId;
	
	private String 	micromarketUuid;
	private String 	micromarketName;
	private Long	micromarketId;
	
	private Double lat;
	private Double lon;
	
	
	

	private int floorCount;
	private int roomCount;
	private int bedCount;
	private Date propertyDueDate;
	
	
	private String siteEngineerUuid;
	private String projectManagerUuid;
	private String zonalHeadUuid;
	private String bdUserUuid;
	
	private String userAssigned;
	private String bdPhoneNumber;
	
    private BrandName brandName;
    private SubBrandName subBrandName;
    
    private GenderAllowed genderAllowed;
    
    private Double totalPlotArea;
    private Double totalPropArea;
    private Double totalPremiseArea;
    private Integer numFloors;
    private Integer numberOfStiltRooms;
    private String propertyImages;
}
