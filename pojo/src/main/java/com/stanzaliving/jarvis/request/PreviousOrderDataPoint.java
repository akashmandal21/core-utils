package com.stanzaliving.jarvis.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PreviousOrderDataPoint {

    private PreviousOrderData previousOrderData;
    private String previousOrderDataName;
    private String value;
}
