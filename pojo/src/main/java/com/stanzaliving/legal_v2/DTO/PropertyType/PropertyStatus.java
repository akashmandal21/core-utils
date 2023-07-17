package com.stanzaliving.legal_v2.DTO.PropertyType;

import com.stanzaliving.estate_v2.dto.KeyValueDto;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class PropertyStatus implements Serializable {
    public static String SEQUENCE_NAME = "PROPERTY_STATUS_";
    private String uuid;
    private String name;
    private Boolean enabled;
    private String backgroundColor;
    private String textColor;
    private String statusDescription;
    private int statusOrder;
    private List<String> moduleVisible;
    private List<KeyValueDto> pagesVisible;
}
