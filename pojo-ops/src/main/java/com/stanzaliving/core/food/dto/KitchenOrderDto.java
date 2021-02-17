package com.stanzaliving.core.food.dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KitchenOrderDto {

	private Integer stanzaStaffCount;
	private Integer nonStanzaStaffCount;

}
