package com.stanzaliving.genericdashboard.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class QuestionPageDto {

    private Integer pageNumber;

    @Builder.Default
    private boolean hasLogical = false;

    @Builder.Default
    private List<QuestionsDto> questionsDtoList=new ArrayList<>();
}
