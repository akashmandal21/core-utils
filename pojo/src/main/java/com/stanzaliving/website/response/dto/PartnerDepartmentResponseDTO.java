package com.stanzaliving.website.response.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartnerDepartmentResponseDTO {

    private Integer partnerDepartmentId;

    private String department;
}
