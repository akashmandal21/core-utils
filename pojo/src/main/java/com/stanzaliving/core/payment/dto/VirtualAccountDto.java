package com.stanzaliving.core.payment.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VirtualAccountDto {

    private String userUuid;

    @NotNull(message = "Resident Id can't be null or empty")
    private String residentId;

    private String firstName;

    private String lastName;
}
