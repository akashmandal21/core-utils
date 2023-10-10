package com.stanzaliving.core.security.policeverification.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PVFormTimelineByTeamResponseDto {

    private String title;

    private String teamTypeName;

    private String actionedBy;

    private List<String> description;

    private Date createdAt;
}
