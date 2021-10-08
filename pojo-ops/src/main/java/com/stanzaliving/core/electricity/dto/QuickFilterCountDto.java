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
    private double count; 
    private double residentShareAmount;
    private double stanzaShareAmount;
    private double residentSharePercent;
    private double stanzaSharePercent;   
}
