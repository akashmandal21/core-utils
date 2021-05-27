package com.stanzaliving.community.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Map;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventTypeDTO {
    @NotBlank
    private String name;

}
