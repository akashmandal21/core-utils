package com.stanzaliving.estate_v2.dto.reviewTemplate.filter;


import com.stanzaliving.estate_v2.dto.KeyValueDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class PropertyStatusDTO {

    private String uuid;
    private String name;
    private String statusDescription;

}
