/**
 * 
 */
package com.stanzaliving.core.operations.dto.serviceset;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 03-Jan-2020
 *
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ServiceSetBudgetingRequestDto {

	private String requestId;

	private String configId;

	private int configVersion;

	private String requestedById;

	private String requestedByName;

	private Date requestedAt;

}