package com.stanzaliving.core.far.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransferAssetRequestDto {
    private String assetUuid;
    private String toNumber;
    private String qrCode;
    private String cartAssetUuid;
    private String addressUuid; // will have sourceLocation during Tx Out & Destination Location during Tx In

    @NotNull
    private boolean transferOut;
}