/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class StayBaseDto {

	private Integer sequenceId;
	private String title;
	private String imgUrl;
	private String text;
	
}
