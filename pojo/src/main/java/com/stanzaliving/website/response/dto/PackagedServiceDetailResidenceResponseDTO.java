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

/**
 * @author nipunaggarwal
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PackagedServiceDetailResidenceResponseDTO {

	private Integer residenceId;
	private String residenceName;
	private Integer charges;
	private Integer PackagedServiceId;
	private String PackagedServiceName;
	private String PackagedServiceDuration;
	private String backgroundImgUrl;
	private String iconImgUrl;
	private String description;
	private String disclaimers;

}
