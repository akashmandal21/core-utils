package com.stanzaliving.productmix.dto.productmix;

import com.stanzaliving.productmix.dto.LabelValueDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomAttributeDto {
    @NotEmpty(message = "Room details cannot be empty/null")
    @Valid
    private List<RoomDetails> roomDetails;

    private Map<String, RoomsDataCombined> roomTemplateOptionsData;

    private boolean errorOccurred;
}
