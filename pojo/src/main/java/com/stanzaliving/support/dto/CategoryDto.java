package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private String uuid;
    private String name;
    private String description;
}
