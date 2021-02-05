package com.stanzaliving.core.commentsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Builder
@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupCommentsDto {

    private String sectionTitle;

    private String commentTitle;

    @NotEmpty
	@Valid
    private List<GroupContext> groupContexts;

    @NotNull(message = "Please enter context type")
    private String contextType;

    @NotNull(message = "Please enter service name")
    private String serviceName;

    @NotNull(message = "Please enter sub context id")
    private String subContextId;

    @NotNull(message = "Please enter comment text")
    private String commentText;

    private Date commentTime;

    private String commentTimeText;

    private String commentBy;

    private Long count;

    @Builder.Default
    private boolean selfComment = Boolean.TRUE;

    private List<GroupCommentsDto> oldData;

}
