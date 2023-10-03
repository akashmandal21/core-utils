package com.stanzaliving.booking.dto;

import com.stanzaliving.booking.enums.ContractStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContractStatusDto {
    @NotBlank(message = "contractUuid can not be blank")
    private String contractUuid;
    @NotNull
    private ContractStatus contractStatus;
}
