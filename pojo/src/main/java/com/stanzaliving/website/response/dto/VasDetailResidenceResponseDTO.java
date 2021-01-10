/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.website.response.dto;

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
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class VasDetailResidenceResponseDTO {

	private Integer residenceId;
	private String residenceName;
	private Integer charges;
	private Integer vasId;
	private String vasName;
	private String vasDuration;
	private String imgUrl;
	private String vasIconImgUrl;
	private String description;
	private String disclaimers;

}
