package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.cafe.enums.ItemListingMethod;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SearchItemRequestDto {
    @NotNull(message = "Empty Cafe Id")
    private String cafeId;
    @NotNull(message = "Empty Residence Id")
    private String residenceId;

    private LocalDate menuDate;
    private ItemListingMethod method;
}
