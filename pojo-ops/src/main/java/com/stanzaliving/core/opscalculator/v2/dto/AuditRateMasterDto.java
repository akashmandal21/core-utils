
package com.stanzaliving.core.opscalculator.v2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class AuditRateMasterDto {

	private String cityUuid;

	private String physicalAuditRate;

	private String cctvAuditRate;

	private String cctvAuditRateMultiplier;
}
