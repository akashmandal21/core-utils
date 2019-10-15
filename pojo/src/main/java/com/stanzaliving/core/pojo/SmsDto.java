/**
 * 
 */
package com.stanzaliving.core.pojo;

import com.stanzaliving.core.enums.SmsType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen
 *
 * @date 12-Oct-2019
 */
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SmsDto {

	private SmsType smsType;

	private String isoCode;

	private String mobile;

	private String text;

}