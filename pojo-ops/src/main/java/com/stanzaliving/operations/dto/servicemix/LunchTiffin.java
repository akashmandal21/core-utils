package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.LunchTiffinDeliveryModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LunchTiffin extends Meal {
	private LunchTiffinDeliveryModel deliveryModel;
}
