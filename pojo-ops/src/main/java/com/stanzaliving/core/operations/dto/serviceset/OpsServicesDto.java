package com.stanzaliving.core.operations.dto.serviceset;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

import com.stanzaliving.core.operations.dto.serviceset.electricity.ElectricityServiceDto;
import com.stanzaliving.core.operations.dto.serviceset.food.FoodCanteenServiceDto;
import com.stanzaliving.core.operations.dto.serviceset.food.FoodCompositionServiceDto;
import com.stanzaliving.core.operations.dto.serviceset.food.FoodMealServiceDto;
import com.stanzaliving.core.operations.dto.serviceset.gym.GymServiceDto;
import com.stanzaliving.core.operations.dto.serviceset.housekeeping.HouseKeepingServiceDto;
import com.stanzaliving.core.operations.dto.serviceset.internet.InternetServiceDto;
import com.stanzaliving.core.operations.dto.serviceset.laundry.LaundryServiceDto;
import com.stanzaliving.core.operations.dto.serviceset.security.SecurityServiceDto;
import com.stanzaliving.core.operations.dto.serviceset.transport.TransportServiceDto;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class OpsServicesDto extends OpsServiceDataDto {

	private List<ServiceMetadata> serviceMetadatas;

	private FoodMealServiceDto foodMealServiceDto;

	private FoodCompositionServiceDto foodCompositionServiceDto;

	private FoodCanteenServiceDto foodCanteenServiceDto;

	private InternetServiceDto internetServiceDto;

	private HouseKeepingServiceDto houseKeepingServiceDto;

	private LaundryServiceDto laundryServiceDto;

	private ElectricityServiceDto electricityServiceDto;

	private TransportServiceDto transportServiceDto;

	private GymServiceDto gymServiceDto;

	private SecurityServiceDto securityServiceDto;

}