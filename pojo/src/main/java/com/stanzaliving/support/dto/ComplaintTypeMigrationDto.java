package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplaintTypeMigrationDto {

    @JsonSetter(value="name")
    private String name;

    @JsonSetter(value="description")
    private String description;

    @JsonSetter(value="image_url")
    private String imageUrl;

}
