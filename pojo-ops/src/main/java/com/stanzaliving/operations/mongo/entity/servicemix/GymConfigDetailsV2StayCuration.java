package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.dto.servicemix.GymDetails;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class GymConfigDetailsV2StayCuration implements Serializable {
    private String planId;
    private String planName;
    @Builder.Default
    private GymDetails gym = new GymDetails();
    @Builder.Default
    private GymDetails multigym = new GymDetails();
    @Builder.Default
    private GymDetails treadmill = new GymDetails();

    private boolean active;
}
