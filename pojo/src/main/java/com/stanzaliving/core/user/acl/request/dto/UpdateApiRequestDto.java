/**
 * 
 */
package com.stanzaliving.core.user.acl.request.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen
 *
 * @date 21-Oct-2019
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateApiRequestDto extends AddApiRequestDto {

	@NotBlank(message = "Api Id is Mandatory For Api")
	private String apiId;

}