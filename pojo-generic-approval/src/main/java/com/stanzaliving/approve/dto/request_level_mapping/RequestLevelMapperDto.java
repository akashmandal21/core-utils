package com.stanzaliving.approve.dto.request_level_mapping;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestLevelMapperDto {

    @NotNull(message = "LevelUUID cannot be null")
    @NotBlank(message = "LevelUUID cannot be blank")
    private String levelUUID;

    @NotBlank(message = "Mail configuration cannot be blank")
    private List<Object> mailConfig;
}
