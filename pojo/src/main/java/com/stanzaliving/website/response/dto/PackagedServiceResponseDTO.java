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
public class PackagedServiceResponseDTO {

	private Integer PackagedServiceId;
	private String PackagedServiceName;
	private String backgroundImgUrl;
	private String iconImgUrl;
	private String description;
	private String disclaimers;

}
