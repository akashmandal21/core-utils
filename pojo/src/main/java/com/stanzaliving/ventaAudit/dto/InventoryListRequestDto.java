package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventoryListRequestDto {

    @NotBlank
    private String bookingUuid;
    @NotBlank
    private String entityUuid;
    @NotBlank
    private String roomName;
    @NotBlank
    private String roomElementsName;
    @NotBlank
    private String roomElementsUuid;
    @Min(value = 1)
    private Double quantity;
    @NotEmpty
    private List<@NotBlank String> onboardingImageUrl;
    @NotBlank
    private String roomUuid;
    private String uuid;

}
