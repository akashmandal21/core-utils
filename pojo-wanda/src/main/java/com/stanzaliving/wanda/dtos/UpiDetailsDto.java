/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpiDetailsDto {

	@NotEmpty
	private String vpa;

	private String userId;
	
	@NotEmpty
	private String userName;

	@Builder.Default
	private Boolean isVerified = false;
}
