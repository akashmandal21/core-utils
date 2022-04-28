package com.stanzaliving.core.user.acl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MicromarketAndResidencesDropdownRequestDto {

    private List<String> cityUuids;
    private String searchText;
}
