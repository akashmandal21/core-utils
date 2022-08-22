package com.stanzaliving.website.response.dto;

import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartnerWithUsRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

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
