package com.stanzaliving.campaign.dto;

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
public class DetractorDto {
    private boolean isDetractors;
    private String answer;
}
