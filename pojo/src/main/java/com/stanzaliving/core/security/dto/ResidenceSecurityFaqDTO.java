package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceSecurityFaqDTO {

    private String question;

    private String answer;

    private int order;
}
