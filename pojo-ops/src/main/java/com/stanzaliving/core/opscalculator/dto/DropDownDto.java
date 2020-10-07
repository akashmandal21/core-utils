package com.stanzaliving.core.opscalculator.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DropDownDto {
    private String value;
    private String label;
}