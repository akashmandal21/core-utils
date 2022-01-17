package com.stanzaliving.legal_v2.DTO.PropertyType;

import com.stanzaliving.estate_v2.enumeration.PropertyTypeDetailsCondition;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyTypeDetails implements Serializable {
    private String name;
    private PropertyTypeDetailsCondition condition;

}
