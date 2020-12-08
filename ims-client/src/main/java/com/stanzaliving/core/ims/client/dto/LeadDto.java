package com.stanzaliving.core.ims.client.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author harman
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LeadDto {

    private String firstName;

    private String lastName;

    private String mobileNumber;

    private String email;

    private String gender;

    private Long cityId;

    private Long localityId;
}
