package com.stanzaliving.core.cafe.dto;

import com.stanzaliving.core.cafe.enums.CafeSlotCopyOption;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeSlotCopyRequestDto {
    @NotNull(message = "Empty Cafe Id")
    private String cafeId;
    @NotNull(message = "Empty Copy Option")
    private CafeSlotCopyOption option;
    @NotNull(message = "Empty To Residences")
    private List<String> toResidences;
    @NotNull(message = "Empty Slots")
    private List<String> slots;
    private LocalDate fromDate;
    private LocalDate toDate;
}
