package com.stanzaliving.website.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MicromarketAliasResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer micromarketAliasId;
    private String micromarketAliasName;
    private Integer micromarketId;
    private String micromarketName;
    private String displayName;
}
