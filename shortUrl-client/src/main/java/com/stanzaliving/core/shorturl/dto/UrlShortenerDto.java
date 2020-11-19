package com.stanzaliving.core.shorturl.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UrlShortenerDto {

	private String clientUuid;
	private int expiryTime;
	private String longUrl;
	private String userToken;
}
