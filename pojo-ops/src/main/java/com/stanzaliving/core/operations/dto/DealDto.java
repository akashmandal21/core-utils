/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.time.LocalDate;

import com.stanzaliving.core.operations.enums.DealStatus;
import com.stanzaliving.core.operations.enums.DealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 * @date 05-Feb-2021
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DealDto {

	private String uuid;

	private String residenceUuid;

	private String dealName;

	private DealType dealType;

	private DealStatus dealStatus;

	private boolean mgDeal;

	@Builder.Default
	private Integer mgCount = 0;

	private String pocName;

	private String pocContact;

	private String pocEmail;

	private LocalDate dealFromDate;

	private LocalDate dealToDate;

	private LocalDate dealCreatedAtVenta;

	private String statementOfWorkDocumentUrl;

}