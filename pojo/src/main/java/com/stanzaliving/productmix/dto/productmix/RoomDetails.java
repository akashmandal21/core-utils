package com.stanzaliving.productmix.dto.productmix;

import com.stanzaliving.productmix.dto.LabelValueDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomDetails {

    private String uuid;

    @NotBlank(message = "Room number cannot be blank")
    private String roomNumber;

    @NotNull(message = "Position cannot be blank")
    private int position;

    @NotNull(message = "Floor cannot be blank")
    private String floor;

    @NotNull(message = "Beds cannot be null")
    private int beds;

    @NotNull (message = "Room template cannot be null")
    @Valid
    private LabelValueDto<String> roomTemplate;

    private String errorMsg;

    private boolean errorOccurred;
}
