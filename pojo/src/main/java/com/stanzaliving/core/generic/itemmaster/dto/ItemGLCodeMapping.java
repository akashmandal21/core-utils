package com.stanzaliving.core.generic.itemmaster.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ItemGLCodeMapping implements Serializable {


    private String itemCategory;
    private String itemSubCategory;
    private String costHead;

    @EqualsAndHashCode.Exclude
    private String glCode;

}
