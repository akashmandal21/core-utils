package com.stanzaliving.operations.dto.servicemix;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class PlanData {

    private int data;
    private int speed;
    private int validity;
}
