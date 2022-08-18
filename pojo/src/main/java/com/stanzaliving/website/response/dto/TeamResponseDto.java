package com.stanzaliving.website.response.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer teamId;
    private String teamName;
    private String imgurl;
    private Integer sequenceId;

}
