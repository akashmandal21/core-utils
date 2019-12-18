/**
 * 
 */
package com.stanzaliving.core.user.acl.request.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

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
	private String apiUuid;

}