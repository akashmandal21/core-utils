package com.stanzaliving.core.po.generic.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TOItemUIDto {

    Set<BasicTOItem> poItems;

}
