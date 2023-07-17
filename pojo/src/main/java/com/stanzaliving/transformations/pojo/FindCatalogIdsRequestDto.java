package com.stanzaliving.transformations.pojo;

import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.core.estate.enums.EstateGender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FindCatalogIdsRequestDto {

    private List<String> micromarketUuids;
    private List<EstateGender> genders;
    private List<PropertyEntityType> propertyEntityTypes;
}
