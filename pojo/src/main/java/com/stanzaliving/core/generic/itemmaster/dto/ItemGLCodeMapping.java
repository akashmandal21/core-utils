package com.stanzaliving.core.generic.itemmaster.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ItemGLCodeMapping {


    private String itemCategory;
    private String itemSubCategory;
    private String costHead;

    @EqualsAndHashCode.Exclude
    private String glCode;

}
