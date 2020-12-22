package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.cafe.enums.ItemListingMethod;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Collection;

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
    private Collection<String> itemIds;
    private boolean includeRating = true;
    private boolean includeOrders = true;
    private boolean includeResidencePrice = true;
    private boolean activeOnly = true;
    private boolean basicDetailsOnly = false;
}
