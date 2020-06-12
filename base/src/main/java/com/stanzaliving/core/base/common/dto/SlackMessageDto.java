/**
 * 
 */
package com.stanzaliving.core.base.common.dto;

import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author naveen.kumar
 *
 * @date 09-Jun-2020
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SlackMessageDto {

	private String message;

	private String url;
}