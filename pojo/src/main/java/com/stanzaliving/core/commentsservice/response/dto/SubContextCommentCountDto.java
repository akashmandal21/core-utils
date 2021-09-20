package com.stanzaliving.core.commentsservice.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubContextCommentCountDto {

    private String uuid;

    private Long commentCount;
}
