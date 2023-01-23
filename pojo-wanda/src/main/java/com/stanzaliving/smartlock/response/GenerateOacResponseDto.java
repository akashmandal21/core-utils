package com.stanzaliving.smartlock.response;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenerateOacResponseDto {
	
	 private Boolean success;

    @JsonProperty("OACs")
    private List<OacDetailDto> OACs;

    private String message;
}


