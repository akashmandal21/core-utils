package com.stanzaliving.core.venta_aggregation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BedAttributesFilter implements Serializable  {

	private BedCountRange bedCountRange;
	private RentBedRange rentBedRange;
}