package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MetadataDto implements Serializable {
    private String uuid;
    @NotBlank(message = "Name cannot be null")
    private String name;
    @NotBlank(message = "Position cannot be null")
    private int position;
}
