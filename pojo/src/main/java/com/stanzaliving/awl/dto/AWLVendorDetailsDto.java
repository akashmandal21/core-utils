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
 * An DTO representation to InsertVendorDetails of AWL 3rd party client. Check
 * AWL integration http://test.eprontoglobal.com/Service1.svc/InsertVendorDetails
 */


@Data
@NoArgsConstructor
@AllArgsConstructor(onConstructor=@__(@JsonCreator))
@Builder
public class AWLVendorDetailsDto implements Serializable {

	private static final long serialVersionUID = 102989887L;
	
	/**Client Code default Value - Stanza*/
	@JsonProperty("Custcode")
	@NotEmpty(message = "Client Code can't be empty")
	private String cilentCode;
	
	/**Vendor Name**/
	@JsonProperty("Venname")
	@NotEmpty(message = "Vendor Name can't be empty")
	private String vendorName;
	
	/**Vendor ID*/
	@JsonProperty("VenId")
	@NotEmpty(message = "Vendor ID can't be empty")
	private String vendorId;
	
	/**Vendor City*/
	@JsonProperty("Vcity")
	@NotEmpty(message = "Vendor City can't be empty")
	private String vendorCity;

	/**Vendor State*/
	@JsonProperty("Vstate")
	@NotEmpty(message = "Vendor State can't be empty")
	private String vendorState;
	
	/**Vendor Address*/
	@JsonProperty("Vaddress")
	@NotEmpty(message = "Vendor Address can't be empty.")
	private String vendorAddress;
	
	/**Vendor Contact Person*/
	@JsonProperty("Vperson")
	private String vendorContactPerson;
	
	/**Vendor PinCode*/
	@JsonProperty("Vpincode")
	private String vendorPinCode;
	
	/**Vendor Contact Details*/
	@JsonProperty("Mob")
	private String contact;
	
	/**Vendor Email Id*/
	@JsonProperty("Vemail")
	private String vendorEmail;
	
	
	/**Vendor Pan No.*/
	@JsonProperty("Pan")
	private String vendorPan;
	
	/**Vendor GST No.*/
	@JsonProperty("Gstno")
	private String gstNumber;
	
	/**Payment Terms if any*/
	@JsonProperty("Payterm")
	private String payTerm;
	
	
}
