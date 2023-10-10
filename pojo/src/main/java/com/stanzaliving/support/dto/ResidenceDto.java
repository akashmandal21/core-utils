package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceDto implements Serializable {
    private String name;

    private Long id;

    private String uuid;

    private String cityUuid;

    private boolean faqApproved;
}
