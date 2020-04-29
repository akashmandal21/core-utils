package com.stanzaliving.core.inventory_transformations.model;

import com.stanzaliving.inventory.converter.JsonToMapConverter;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Map;

@Entity
@Data
@Builder
@Table(name = "EXT_LEAD_DETAILS")
public class ExtLeadDetails {
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "CITY_NAME")
	private String cityName;
	
	@Column(name = "PHONE")
	private String phone;
	
	@Column(name = "LEAD_SOURCE")
	private String leadSource;
	
	@Column(name = "HASH")
	private String hash;
	
	@Convert(converter = JsonToMapConverter.class)
	private Map<String, String> leadattributes;
	
	@Column(name = "CALLED_NUMBER")
	private String calledNumber;
	
}
