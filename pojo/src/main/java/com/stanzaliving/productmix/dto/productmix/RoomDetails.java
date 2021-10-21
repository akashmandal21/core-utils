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

    @NotBlank
    private String roomNumber;

    @NotNull
    private int position;

    @NotNull
    private int floor;

    @NotNull
    private int beds;

    @NotNull @Valid
    private LabelValueDto<String> roomTemplate;
}
