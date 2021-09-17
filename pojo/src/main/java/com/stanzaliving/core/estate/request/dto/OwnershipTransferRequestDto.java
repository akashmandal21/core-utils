package com.stanzaliving.core.estate.request.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OwnershipTransferRequestDto {
    @NotBlank(message = "currentUserUuid cannot be blank")
    private String currentUserUuid;

    @NotBlank(message = "newUserUuid cannot be blank")
    private String newUserUuid;
}
