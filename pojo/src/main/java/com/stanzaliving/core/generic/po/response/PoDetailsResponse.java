package com.stanzaliving.core.generic.po.response;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.core.generic.po.grn.PoItemDetail;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import com.stanzaliving.core.po.generic.enums.GenericPOType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PoDetailsResponse {

	private String poUuid;
	private GenericPOType potype;
	private GenericPOTOStatus postatus;
	private BigDecimal otherFeeSubTotal;
	private BigDecimal otherFeeGst;
	private BigDecimal poAmount;
	private String vendorUuid;
	private String propertUuid;
	private LocalDate startDate;
	private LocalDate endDate;
	
	List<PoItemDetail> poItemDetails; 
}
