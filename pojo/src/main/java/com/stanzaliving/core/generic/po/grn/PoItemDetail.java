package com.stanzaliving.core.generic.po.grn;

import java.math.BigDecimal;

import com.stanzaliving.core.base.enums.Department;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.transformations.enums.UnitType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PoItemDetail {
	private Department itemDept;
	private String itemUuid;
	private String code;
	private UIKeyValue category;
	private UIKeyValue subCategory;
	private UIKeyValue costHead;
	private String name;
	private UnitType uom;
	private String description;
	private BigDecimal quantity;
	private BigDecimal unitRate;
	private BigDecimal gst;
}
