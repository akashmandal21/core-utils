package com.stanzaliving.core.dto;


import com.stanzaliving.core.enums.ApprovalStatus;
import com.stanzaliving.core.enums.DocumentTypeEnum;
import com.stanzaliving.core.enums.Nationality;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FiltersDTO {
    private List<String> residents;

    private List<String> cities;

    private List<String> micromarkets;

    private List<String> residences;

    private ApprovalStatus approvalStatus;

    private List<Nationality> nationalities;

    private List<DocumentTypeEnum> documentTypes;
}