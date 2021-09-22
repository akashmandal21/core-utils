package com.stanzaliving.website.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebsiteMicromarketAliasDTO {

	private Integer micromarketAliasId;
	private String micromarketAliasName;
	private Integer micromarketId;
	private String micromarketName;
	private String displayName;
}
