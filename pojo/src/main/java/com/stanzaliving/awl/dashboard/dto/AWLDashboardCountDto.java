package com.stanzaliving.awl.dashboard.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AWLDashboardCountDto implements Serializable{

	private static final long serialVersionUID = 112332L;
	private int quantity;
	private double value;
	
	
}
