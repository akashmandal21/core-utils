package com.stanzaliving.sfr.dto.reviewTemplate.filter;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PropertyStatusDTO {

    private String uuid;
    private long count;
    private String name;
    private String statusDescription;

}
