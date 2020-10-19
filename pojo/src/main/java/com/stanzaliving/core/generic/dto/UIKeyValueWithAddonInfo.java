
package com.stanzaliving.core.generic.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Builder
public class UIKeyValueWithAddonInfo {

    @EqualsAndHashCode.Exclude
    @NotBlank
    private String label;
    @NotBlank
    private String value;

    @EqualsAndHashCode.Exclude
    private Map<String,Object> extraData;
}

