package com.stanzaliving.website.response.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartnerWithUsResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer partnerWithUsId;
    private String fullName;
    private String contactNumber;
    private String email;
    private String message;
    private String department;

}
