package com.stanzaliving.website.response.dto;

import lombok.Data;

@Data
public class SystemGeneratedTags {
    private boolean hotLead;
    private boolean preBooked;
    private String expectedDOV;
}
