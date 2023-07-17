/**
 * 
 */
package com.stanzaliving.core.security.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class LastQrScanResponseDataDto {

	private LocalDateTime foodScanLastDate;
	private String userId;
	private String qrContextType;

}