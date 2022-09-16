package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComplaintGroupDto implements Serializable {
    private int position;
    private String uuid;
    private String name;
    private String description;
    private String imageUrl;
    private boolean active;
    private List<CategoryDto> categories = new ArrayList<>();

    public ComplaintGroupDto(String name, String uuid) {
        this.name = name;
        this.uuid = uuid;
    }
}
