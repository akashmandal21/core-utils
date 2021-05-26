package com.stanzaliving.estate_v2.dto.questionTemplate;

import com.stanzaliving.estate_v2.dto.KeyValueDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class PrivilegeDto {
    private List<KeyValueDto> fill;
    private List<KeyValueDto> approve;
    private List<KeyValueDto> view;
}
