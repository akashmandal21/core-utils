package com.stanzaliving.estate_v2.dto.questionTemplate;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.core.dto.SortDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class QuestionTemplateFilterDto extends PaginationRequest {
    private List<SortDto> sort;
    private FilterQuestionTemplateDto filter;
}