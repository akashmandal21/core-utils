package com.stanzaliving.core.commentsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Builder
@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupContext {

    @NotBlank(message = "Context Id can't be blank")
    private String contextId;

    private String subContextId;

}
