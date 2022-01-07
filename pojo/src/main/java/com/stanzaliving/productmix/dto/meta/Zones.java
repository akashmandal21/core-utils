package com.stanzaliving.productmix.dto.meta;

import com.stanzaliving.core.utilservice.annotations.Range;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Zones {

    @NotBlank(message = "Zone name cannot be blank")
    private String name;

    private int position;

    @Valid
    @NotEmpty(message = "Zone attributes cannot be empty")
    private List<ZonesAttributes> attributes;
}
