package com.stanzaliving.operations.dto.servicemix;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Map;

@Data
public class ServiceMixTagDto implements Serializable {
    @NotEmpty
    private Map<String, String> tags;

    @NotBlank
    private String serviceMixUuid;
}
