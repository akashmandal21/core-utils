/**
 * 
 */
package com.stanzaliving.core.user.acl.request.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen
 *
 * @date 21-Oct-2019
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddApiRequestDto {

	@NotBlank(message = "Api Name is Mandatory For New Api")
	private String apiName;

	@NotBlank(message = "Api Action URL is Mandatory For New Api")
	private String actionUrl;

	@NotBlank(message = "Api Category is Mandatory For New Api")
	private String category;

}