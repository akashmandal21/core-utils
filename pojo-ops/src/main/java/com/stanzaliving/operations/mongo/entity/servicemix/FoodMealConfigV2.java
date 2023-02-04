package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.dto.servicemix.BooleanConfig;
import com.stanzaliving.operations.dto.servicemix.LunchTiffin;
import com.stanzaliving.operations.dto.servicemix.Meal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class FoodMealConfigV2 extends BooleanConfig {

    private Meal breakfast;

    private Meal brunch;

    private Meal lunch;

    private Meal dinner;

    private Meal eveningSnacks;

    private LunchTiffin lunchTiffin;
}
