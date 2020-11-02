package com.stanzaliving.core.cafe.dto.menu;

import com.stanzaliving.core.cafe.enums.ItemListingMethod;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SearchItemRequestDto {
    private String cafeId;
    private String residenceId;
    private ItemListingMethod method;
}
