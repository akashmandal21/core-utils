package com.stanzaliving.core.cafe.dto.menu;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuSlotRequestDto {
    private static final long serialVersionUID = 1L;
    private String cafeId;
    private String residenceId;
    @NotNull(message = "Empty Slot Id")
    private String slotId;
    private List<CafeMenuRequestDto> menu;
}
