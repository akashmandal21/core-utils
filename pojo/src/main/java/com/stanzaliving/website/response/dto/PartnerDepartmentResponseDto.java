package com.stanzaliving.website.response.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartnerDepartmentResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer partnerDepartmentId;

    private String department;
}
