package com.stanzaliving.core.operations.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class CopyToResidenceListRequestDto {
   List<String> residenceIdList;
}
