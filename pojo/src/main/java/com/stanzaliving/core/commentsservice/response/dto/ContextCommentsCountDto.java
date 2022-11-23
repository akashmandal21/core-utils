package com.stanzaliving.core.commentsservice.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContextCommentsCountDto {

    private String uuid;

    private Long commentCount;

    private List<SubContextCommentCountDto> subContext;
}
