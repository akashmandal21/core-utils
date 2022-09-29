package com.stanzaliving.generic_po.dto;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PoFilterDataViewDto {
    Set<String> availableFields;
    Map<String, List<UIKeyValue>> optionsDetails;
    Boolean showBulkUpdateBtn;
}
