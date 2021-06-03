package com.stanzaliving.community.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseEventTypeDTO {
    private Long id;
    private String uuid;
    private String name;
}
