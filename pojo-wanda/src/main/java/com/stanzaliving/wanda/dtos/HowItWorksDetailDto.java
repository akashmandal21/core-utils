/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class HowItWorksDetailDto extends ReferAndEarnBaseDto {

	private String details;

}
