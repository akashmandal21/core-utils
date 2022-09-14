package com.stanzaliving.wanda.response;

import com.stanzaliving.core.complaint.dto.ComplaintFAQDto;
import com.stanzaliving.support.dto.ResidenceDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private int position;
    private String uuid;
    private String name;
    private String description;
    private boolean active;
    private int faqCount;
    private List<SubCategoryDto> subCategories = new ArrayList<>();
    private List<ResidenceDto> residences = new ArrayList<>();
    private List<ComplaintFAQDto> complaintFAQDtos = new ArrayList<>();


    public CategoryDto(String name, String uuid) {
        this.name = name;
        this.uuid = uuid;
    }
}
