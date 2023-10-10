package com.stanzaliving.sfr.dto.propertyOnboarding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertyTypeValueDto implements Serializable {
    private String name;
    private String value;
}
