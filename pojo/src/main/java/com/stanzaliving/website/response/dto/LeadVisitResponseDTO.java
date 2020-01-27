package com.stanzaliving.website.response.dto;

/**
 * @author nipunaggarwal
 *
 */

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@ToString
public class LeadVisitResponseDTO {

	private Integer leadId;
	private Date visitDate;
	private String residenceName;
	private String residenceType;
	private double latitude;
	private double longitude;
	private Set<ImageResponseDTO> images = new HashSet<>(0);
	private AddressResponseDTO address;

}
