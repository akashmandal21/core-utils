package com.stanzaliving.estate_v2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrivilegesDto {
    private List<KeyValueDto> fill;
    private List<KeyValueDto> approve;
    private List<KeyValueDto> view;
}
