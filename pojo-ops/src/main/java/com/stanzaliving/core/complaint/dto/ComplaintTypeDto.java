/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.complaint.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ComplaintTypeDto implements Serializable {

	private static final long serialVersionUID = 7722881879568247915L;
	private String complaintTypeUuid;
	private String name;
	private String description;
	private String imgUrl;
	
	@Builder.Default
	private Boolean status = Boolean.TRUE;
}
