/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

import java.util.Date;
import java.util.List;

import com.stanzaliving.core.estate.enums.EstateStatus;
import com.stanzaliving.core.user.dto.Address;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class ListingDto {

    private String createdBy;

    private Date updatedAt;
	
    private String createdByName;
    
    private String managerName;

    private String createdByNumber;
    
    private String pocNumber;
    
    private String pocName;
    
	private String estateUuid;
	
	private String estateCode;

	private long estateId;
	
	private String estateName;

    private Long cityId;

    private Long micromarketId;

    private Double lat;

    private Double lon;

    private Address address;
	
	private String cityName;

	private String microMarketName;

	private Integer beds;

	private Integer rooms;

	private Long rentPerBed;
	
	private Integer rent;

	private Date llHandoverDate;

	private Date addedOn;

	private String currentStatusDesc;

	private String colorCode;
	
	private String backgroundColorCode;
	
	private EstateStatus currentStatus;
	
	private String houseName;
	
	private List<String> images;
}
