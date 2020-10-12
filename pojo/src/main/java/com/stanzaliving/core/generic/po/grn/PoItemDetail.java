package com.stanzaliving.core.generic.po.grn;

import java.math.BigDecimal;

import com.stanzaliving.core.base.enums.Department;

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

	private String itemUuid;
	private String code;
	private String category;
	private String subCategory;
	private String name;
	private String description;
	private Integer quantity;
	private BigDecimal unitRate;
	private BigDecimal gst;
	private BigDecimal itemWeightAvg;
	private Department department;
}
