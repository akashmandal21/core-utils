package com.stanzaliving.awl.dto;

import java.io.Serializable;

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
public class AWLBaseResponseDto implements Serializable {

	private static final long serialVersionUID = 18989887L;

	/**ID from AWL service(acts as a primary key for AWL)*/
	@JsonProperty("ID")
	private String id;
	/**SUCCESS / FAILURE*/
	private String message;
	/**true / false*/
	private boolean status;
	/**HTTPStatus code such as 2xx,4xx,5xx etc*/ 
	private int statusCode;


}
