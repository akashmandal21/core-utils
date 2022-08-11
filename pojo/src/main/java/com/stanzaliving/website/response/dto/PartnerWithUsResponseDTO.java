package com.stanzaliving.website.response.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartnerWithUsResponseDTO {

    private Integer partnerWithUsId;
    private String fullName;
    private String contactNumber;
    private String email;
    private String message;
    private String department;

}
