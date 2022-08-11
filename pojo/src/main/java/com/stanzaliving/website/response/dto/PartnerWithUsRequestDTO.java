package com.stanzaliving.website.response.dto;

import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartnerWithUsRequestDTO {

    @NotBlank(message = "Full name is mandatory")
    private String fullName;
    @NotBlank(message = "Contact number is mandatory")
    private String contactNumber;
    @NotBlank(message = "Email is mandatory")
    private String email;
    @Column(name = "message", columnDefinition = "LONGTEXT")
    private String message;
    private Integer partnerDepartmentId;

}
