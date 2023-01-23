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
	
	Boolean success;

    @JsonProperty("OACs")
    List<OacDetailDto> OACs;

    String message;
}


