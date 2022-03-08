package com.stanzaliving.core.user.acl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MicromarketAndResidencesDropdownResponseDto {

    private String micromarketUuid;
    private String micromarketName;
    private List<Map<String, String>> residenceNameUuidMapList;
}
