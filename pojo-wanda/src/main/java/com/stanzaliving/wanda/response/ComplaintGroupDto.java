package com.stanzaliving.wanda.response;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComplaintGroupDto {

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
