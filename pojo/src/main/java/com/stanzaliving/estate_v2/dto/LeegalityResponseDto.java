package com.stanzaliving.estate_v2.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LeegalityResponseDto {
    private String status;
    private String documentUrl;
    private String propertyId;
}
