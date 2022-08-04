package com.stanzaliving.core.electricity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class QuickFilterCountDto {
    private String id;
    private String name;
    private double amount; 
    private double residentShareAmount;
    private double stanzaShareAmount;
    private double residentSharePercent;
    private double stanzaSharePercent;
    private double residentPrepaidShareAmount;
    private double residentPrepaidSharePercent;
    private Integer sequence;
}
