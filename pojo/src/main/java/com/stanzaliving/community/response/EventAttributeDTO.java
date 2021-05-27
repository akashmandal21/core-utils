package com.stanzaliving.community.response;

import com.stanzaliving.community.response.Options;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventAttributeDTO {
    private String fieldName;
    private String alias;
    private String type;
    private boolean isMandatory;
    private List<Options> options;
    private Long width;

}
