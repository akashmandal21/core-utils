
package com.stanzaliving.core.opscalculatorv2.dto;

import java.io.Serializable;

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
public class AuditRateMasterDto implements Serializable  {

	private String cityUuid;
	
	private String microMarketUuid;

	private String physicalAuditRate;

	private String cctvAuditRate;
	
	private String safePlaceAuditRate;

	private String cctvAuditRateMultiplier;
}
