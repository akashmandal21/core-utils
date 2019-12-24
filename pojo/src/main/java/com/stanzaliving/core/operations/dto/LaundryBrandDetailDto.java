package com.stanzaliving.core.operations.dto;


import com.stanzaliving.core.operations.enums.Days;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class LaundryBrandDetailDto {

    private String serviceDetailId;
    private List<Days> days;
    private boolean available;
    private boolean availableAsVas;
    private String brandName;

}
