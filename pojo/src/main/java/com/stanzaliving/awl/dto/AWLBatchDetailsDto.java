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
 * An DTO representation to InsertBatchDetails of AWL 3rd party client. Check
 * AWL integration http://test.eprontoglobal.com/Service1.svc/InsertBatchDetails
 */

@Data
@NoArgsConstructor
@AllArgsConstructor(onConstructor=@__(@JsonCreator))
@Builder
public class AWLBatchDetailsDto implements Serializable {

	private static final long serialVersionUID = 10989887L;
	
	@NotEmpty(message = "Client code can't be empty.")
	@JsonProperty("Custcode")
	private String Custcode;
	
	@NotEmpty(message = "Item code can't be empty")
	@JsonProperty("Sku")
	private String Sku;
	
	
	@NotEmpty(message = "Batch code can't be empty")
	@JsonProperty("Batchno")
	private String Batchno;

	@NotEmpty(message = "Manufacturing Date can't be empty and be in format yyyy-MM-dd")
	@JsonProperty("Mfgdate")
	private String Mfgdate;
	
	
	@NotEmpty(message = "Expiring Date can't be empty and be in format yyyy-MM-dd")
	@JsonProperty("Expdate")
	private String Expdate;

	@JsonProperty("Bbuse")
	private int Bbuse;
	
	@JsonProperty("Mrp")
	private float Mrp;

	@JsonProperty("Note")
	private String Note;
	
}
