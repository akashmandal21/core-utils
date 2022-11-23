package com.stanzaliving.core.shorturl.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UrlShortenerDto {

	private String clientUuid;
	private int expiryTime;
	private String longUrl;
	private String userToken;
}
