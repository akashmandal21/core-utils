package com.stanzaliving.awl.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

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
public class InsertDealerDetailsDto implements Serializable {

	private static final long serialVersionUID = 198734L;
	@NotEmpty(message = "Client code can't be empty.")
	private String Ccode;
	@NotEmpty(message = "House name can't be empty.")
	private String Dname;
	@NotEmpty(message = "House city can't be empty.")
	private String Dcity;
	@NotEmpty(message = "Billing address can't be empty")
	private String Baddress;
	@NotEmpty(message = "Delivery address can't be empty.")
	private String Daddress;
	@NotEmpty(message = "PINCode can't be empty.")
	private String Pincode;
	@NotEmpty(message = "Mobile can't be empty")
	private String Mob1;
	private String mob2;
	
	private String Email;
	private String Awlcrm;
	
	private int Awlcrmno;
	private String Remarks;
	private String Dcode;
	private String Gstin;
	private String Dstate;

}
