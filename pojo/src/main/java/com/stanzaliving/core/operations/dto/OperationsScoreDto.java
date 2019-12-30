/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 22-Nov-2019
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OperationsScoreDto {

	private Integer score;

	private Integer productSet;

	private Integer serviceSet;

	private Integer budgets;

	private Integer vendors;

	private Integer policies;

	private Integer people;

	private Integer hoto;

	private Integer devices;
}