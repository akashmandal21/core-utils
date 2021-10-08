package com.stanzaliving.core.electricity.dto;

import java.util.Date;
import java.util.Map;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.electricity.constants.ElectricityBillStatus;
import com.stanzaliving.core.electricity.constants.ElectricityBillType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ElectricityBillDetailDto extends AbstractDto {

	private static final long serialVersionUID = 6801852116636272900L;

	private String residenceId;

	private String propertyId;

	private String billNumber;

	private String billId;

	private ElectricityBillType electricityBillType;

	private Date billStartDate;

	private Date billEndDate;

	private String billUrl;

	private Double totalConsumptionCharges;

	private Double gridConsumptionCharges;

	private Double dgConsumptionCharges;

	private Double otherCharges;

	private Double penalties;

	private Double arrears;

	private Double totalUnits;

	private Double dgUnits;

	private Double gridUnits;

	private Double dgUnitRate;

	private Double gridUnitRate;

	private Map<String, Object> config;

	private Date addedAt;

	private String addedBy;

	private ElectricityBillStatus electricityBillStatus;

	private ApprovalStatus approvalStatus;

}