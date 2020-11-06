package com.stanzaliving.core.cafe.dto.menu;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuRequestDto {
    private static final long serialVersionUID = 1L;
    @NotNull(message = "Empty Menu Date")
    private LocalDate menuDate;
    private String uuid;
    private List<CafeMenuItemRequestDto> items;
}
