package com.stanzaliving.awl.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.codehaus.jackson.annotate.JsonCreator;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * An DTO representation to InsertSKUDetails of AWL 3rd party client. Check
 * AWL integration http://test.eprontoglobal.com/Service1.svc/InsertSKUDetails
 */


@Data
@NoArgsConstructor
@AllArgsConstructor(onConstructor=@__(@JsonCreator))
@Builder
public class AWLSKUDetailsDto implements Serializable {
	
	private static final long serialVersionUID = 7934154351334140475L;
	
	@NotEmpty(message = "Sku_Name can't be empty.")
	@JsonProperty("Sku_Name")
	private String skuName;
	
	@NotEmpty(message = "SKU Desc can't be empty.")
	@JsonProperty("Desc")
	private String description;
	
	@JsonProperty("Catg1")
	private String catg1;
	
	@JsonProperty("Catg2")
	private String catg2;
	
	@JsonProperty("Catg3")
	private String catg3;
	
	@JsonProperty("Lenght")
	private float length;

	@JsonProperty("Breadth")
	private float breadth;
	
	@JsonProperty("Height")
	private float height;
	
	@JsonProperty("Weight")
	private float weight;
	
	/**Master Child Qty Fixed Value= 1*/
	@JsonProperty("Mstr_Child_Qty")
	private int masterChildQuantity;
	
	@JsonProperty("Staking_level")
	private int stakingLevel;
	
	//YES/NO 
	@JsonProperty("Sr_No")
	private String serialNumberExists;
	
	//YES/NO 
	@JsonProperty("Batch_No")
	private String batchNumberExists;
	
	@JsonProperty("MasterSKU")
	private String masterSKU;
	
	@JsonProperty("Size")
	private String size;
	
	@JsonProperty("Unit")
	private String unit;
	
	@JsonProperty("Style")
	private String style;
	
	@JsonProperty("MRP")
	private float mrp;
	
	@JsonProperty("Color")
	private String color;
	
	@JsonProperty("Season")
	private String season;
	
	
	@NotEmpty(message = "HSNo can't be empty.")
	@JsonProperty("Hsnno")
	private String hsNo;
	
	@NotEmpty(message = "PackSpecication can't be empty.")
	@JsonProperty("PackSpec")
	private String packSpecification;
	
	/**Item is Master or not*/
	@JsonProperty("Stmaster")
	private String isMaster;
	
	/**Pack Of Qty*/
	@JsonProperty("Stpack")
	private String packOfQuantity;
	
}
