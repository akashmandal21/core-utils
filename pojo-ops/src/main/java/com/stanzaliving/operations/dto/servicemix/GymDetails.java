package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.GymLocation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class GymDetails extends BooleanConfig {

    private List<List<String>> timing;
    private GymLocation location;
}
