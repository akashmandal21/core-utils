/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.wanda.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@JsonIgnoreProperties({ "imgUrl" })
public class HowItWorksDto extends ReferAndEarnBaseDto{

	private List<HowItWorksDetailDto> steps;

}
