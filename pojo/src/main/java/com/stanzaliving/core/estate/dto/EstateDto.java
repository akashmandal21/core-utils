/**
 * 
 */
package com.stanzaliving.core.estate.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.estate.enums.EstateStatus;
import com.stanzaliving.core.legal.enums.LegalAgreementDocTypes;
import com.stanzaliving.core.user.dto.Address;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author naveen.kumar
 *
 * @date 30-Oct-2019
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class EstateDto extends AbstractDto {

	private String estateName;

	private String estatePropertyId;

	private Address address;

	private Long cityId;

	private String cityName;

	private Long micromarketId;

	private String micromarketName;

	private Double lat;

	private Double lon;

	private EstateStatus estateStatus;

	private String propertyStatus;

	private String propertyStatusDescription;

	private String colorCode;

	private String backgroundColorCode;

	private String estateCode;
	
	private String managerName;
	
	private String propertyName;
	
	private LegalAgreementDocTypes legalAgreementDocType;

	private String brandType;

	private String competitorName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date propertyApprovalTime;

}