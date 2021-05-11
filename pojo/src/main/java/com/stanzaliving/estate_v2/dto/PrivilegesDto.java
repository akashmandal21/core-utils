package com.stanzaliving.estate_v2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PrivilegesDto {
    private List<KeyValueDto> fill;
    private List<KeyValueDto> approve;
    private List<KeyValueDto> view;
}
