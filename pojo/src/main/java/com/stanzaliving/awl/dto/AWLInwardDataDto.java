package com.stanzaliving.awl.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/***
 * An DTO representation to Inward Data of AWL 3rd party client. Check AWL
 * integration http://test.eprontoglobal.com/Service1.svc/GetInward
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AWLInwardDataDto implements Serializable {

	private static final long serialVersionUID = 19873423L;

	@JsonProperty("Categoryname")
	private String categoryName;

	@JsonProperty("categorycode")
	private String categoryCode;

	@JsonProperty("fromcity")
	private String fromCity;

	@JsonProperty("itemcode")
	private String itemCode;

	@JsonProperty("itemdescription")
	private String itemDescription;

	@JsonProperty("qty")
	private Integer quantity;

	@JsonProperty("value")
	private float value;

	@JsonProperty("vendor")
	private String vendor;

	@JsonProperty("vendor_code")
	private String vendorCode;

	@JsonProperty("warehousecity")
	private String warehouseCity;

	@JsonProperty("warehousename")
	private String warehouseName;

	@JsonProperty("whid")
	private String warehouseId;
}
