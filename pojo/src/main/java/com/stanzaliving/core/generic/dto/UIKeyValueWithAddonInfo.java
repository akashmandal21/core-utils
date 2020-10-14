
package com.stanzaliving.core.generic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class UIKeyValueWithAddonInfo {

    @EqualsAndHashCode.Exclude
    @NotBlank
    private String label;
    @NotBlank
    private String value;

    @EqualsAndHashCode.Exclude
    private Map<String,Object> extraData;
}

