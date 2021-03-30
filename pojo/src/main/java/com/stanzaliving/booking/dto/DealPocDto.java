package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DealPocDto {
    private String uuid;
    private String name;
    private String email;
    private String phone;
    private String image;
    private Boolean primary = Boolean.FALSE;
}
