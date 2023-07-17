package com.stanzaliving.productmix.dto.productmix;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomsCsvDto {

    @NotBlank(message = "Product mix uuid cannot be blank")
    private String productMixUuid;

    @NotBlank(message = "File path cannot be blank")
    private String filePath;

    @NotNull(message = "Number of rooms cannot be null")
    private Integer noOfRooms;
}
