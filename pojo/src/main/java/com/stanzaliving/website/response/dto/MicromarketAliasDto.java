package com.stanzaliving.website.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MicromarketAliasDto {

    private Integer micromarketAliasId;
    private String micromarketAliasName;
    private Integer micromarketId;
    private String micromarketName;
    private String displayName;
}
