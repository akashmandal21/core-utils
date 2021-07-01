package com.stanzaliving.po.generic.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class POItemUiDto {
    Set<BasicPoItem> poItems;
}
