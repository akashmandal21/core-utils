package com.stanzaliving.estate_v2.dto.questionTemplate.conditions;

import com.stanzaliving.estate_v2.dto.KeyValueDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class OperandsDto implements Serializable {
    private String key;
    private List<KeyValueDto> value;
    private String answer;
}
