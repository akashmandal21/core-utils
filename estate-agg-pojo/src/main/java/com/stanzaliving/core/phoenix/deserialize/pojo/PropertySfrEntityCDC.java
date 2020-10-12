package com.stanzaliving.core.phoenix.deserialize.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertySfrEntityCDC {

	@JsonProperty("id")
	private Long sfrId;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("created_by")
	private String createdBy;

	@JsonProperty("updated_at")
	private Date updatedAt;

	@JsonProperty("updated_by")
	private String updatedBy;

	@JsonProperty("status")
	private boolean status = true;

	@JsonProperty("uuid")
	String sfrUuid;

	@JsonProperty("estate_id")
	private String estateId;

	@JsonProperty("property_id")
	private String propertyId;

	@JsonProperty("property_name")
	private String propertyName;

	@JsonProperty("city")
	private String city;

	@JsonProperty("city_uuid")
	private String cityUuid;

	@JsonProperty("micromarket_id")
	private String micromarketId;

	@JsonProperty("micromarket_name")
	private String micromarketName;

	@JsonProperty("lat")
	private Double lat;

	@JsonProperty("lon")
	private Double lon;

	@JsonProperty("user_assigned")
	private String userAssigned;

	@JsonProperty("bd_phone_number")
	private String bdPhoneNumber;

	@JsonProperty("sfr_status")
	private String sfrStatus;

	@JsonProperty("floor_count")
	private int floorCount;

	@JsonProperty("room_count")
	private int roomCount;

	@JsonProperty("bed_count")
	private int bedCount;

	@JsonProperty("area")
	private int area;

	@JsonProperty("due_date")
	private Date propertyDueDate;

}