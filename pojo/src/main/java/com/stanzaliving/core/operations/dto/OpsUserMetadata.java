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
 * @date 03-Dec-2019
 *
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class OpsUserMetadata {

	private String userId;

	private String userName;

	private Double rating;

	private String role;

	private String designation;
}