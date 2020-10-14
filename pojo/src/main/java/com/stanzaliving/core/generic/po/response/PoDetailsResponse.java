package com.stanzaliving.core.generic.po.response;

import java.math.BigDecimal;
import java.util.List;

import com.stanzaliving.core.generic.po.enums.PoStatusEnum;
import com.stanzaliving.core.generic.po.enums.PoType;
import com.stanzaliving.core.generic.po.grn.PoItemDetail;

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
	private PoType potype;
	private PoStatusEnum postatus;
	private BigDecimal otherFeeSubTotal;
	private BigDecimal otherFeeGst;
	private BigDecimal poAmount;
	private BigDecimal gsriAmount;
	private String vendorUuid;
	private String propertUuid;
	
	List<PoItemDetail> poItemDetails; 
}
