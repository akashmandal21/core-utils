package com.stanzaliving.awl.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/***
 * An DTO representation to InsertDealerDetails of AWL 3rd party client.
 * Check AWL integration
 * http://test.eprontoglobal.com/Service1.svc/InsertDealerDetails
 * */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AWLDealerDetailsDto implements Serializable {

	private static final long serialVersionUID = 198734L;
	
	/**Client Code default Value - STANZA*/
	@NotEmpty(message = "Client code can't be empty.")
	@JsonProperty("Ccode")
	private String clientCode;
	
	/**House Name*/
	@NotEmpty(message = "House name can't be empty.")
	@JsonProperty("Dname")
	private String houseName;
	
	/**House City*/
	@NotEmpty(message = "House city can't be empty.")
	@JsonProperty("Dcity")
	private String houseCity;
	
	/**House billing Address*/
	@NotEmpty(message = "Billing address can't be empty")
	@JsonProperty("Baddress")
	private String billingAddress;
	
	/**House Delivery Address*/
	@NotEmpty(message = "Delivery address can't be empty.")
	@JsonProperty("Daddress")
	private String deliveryAddress;
	
	/**House PinCode*/
	@NotEmpty(message = "PINCode can't be empty.")
	@JsonProperty("Pincode")
	private String housePinCode;
	
	/**House Mobile No.*/
	@NotEmpty(message = "Mobile can't be empty")
	@JsonProperty("Mob1")
	private String primaryMobile;
	
	/**House Mobile No.*/
	@JsonProperty("Mob2")
	private String secondaryMobile;
	
	/**House Email*/
	@JsonProperty("Email")
	private String houseEmail;
	
	/**AWL CRM Who Handles the Client*/
	@JsonProperty("Awlcrm")
	private String awlCRMPerson;
	
	
	/**AWL CRM Contact No.*/
	@JsonProperty("Awlcrmno")
	private String awlCRMContactNo;
	
	
	/**Remarks If Any*/
	@JsonProperty("Remarks")
	private String remarks;
	
	/**House Code if any*/
	@JsonProperty("Dcode")
	private String houseCode;
	
	
	/**Dealer/House GSTNO*/
	@NotEmpty(message = "Dealer GSTNo can't be empty.")
	@JsonProperty("Gstin")
	private String dealerGSTNo;
	
	/**Dealer/House State*/
	@NotEmpty(message = "Dealer/House State can't be empty.")
	@JsonProperty("Dstate")
	private String dealerState;

}
