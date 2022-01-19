package com.stanzaliving.legal_v2.DTO.PropertyType;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class ParentUuidName implements Serializable {
    private String uuid;
    private String name;
}
