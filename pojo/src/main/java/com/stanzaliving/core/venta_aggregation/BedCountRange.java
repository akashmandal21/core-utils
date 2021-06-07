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
@NoArgsConstructor
@AllArgsConstructor
public class BedCountRange implements Serializable  {

	private int startRange;
	private int endRange;
}
