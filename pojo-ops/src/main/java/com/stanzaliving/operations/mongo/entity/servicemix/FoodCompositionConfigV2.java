package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.dto.servicemix.BooleanConfig;
import com.stanzaliving.operations.dto.servicemix.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class FoodCompositionConfigV2 extends BooleanConfig {

    private List<Tag> tags;
}
