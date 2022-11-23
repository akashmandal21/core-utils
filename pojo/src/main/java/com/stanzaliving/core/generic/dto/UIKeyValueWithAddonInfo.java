
package com.stanzaliving.core.generic.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class UIKeyValueWithAddonInfo extends UIKeyValue {
    @EqualsAndHashCode.Exclude
    private Map<String,Object> extraData;
}

