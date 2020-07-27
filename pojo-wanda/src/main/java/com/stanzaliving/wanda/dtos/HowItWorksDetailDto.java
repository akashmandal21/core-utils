/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HowItWorksDetailDto {

	private Integer sequenceId;
	private String imgUrl;
	private String title;
	private String details;

}
