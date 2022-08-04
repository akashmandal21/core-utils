package com.stanzaliving.productmix.dto.propertytemplate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ZonesSelected {
    @NotEmpty
    List<String> zones;
}
