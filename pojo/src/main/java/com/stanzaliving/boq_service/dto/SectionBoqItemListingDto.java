package com.stanzaliving.boq_service.dto;

import com.stanzaliving.boq_service.BoqInfoDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SectionBoqItemListingDto {

    private List<SectionalBoqDto> sectionsItemList;

    private BoqInfoDto boqItemList;
}
