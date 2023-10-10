package com.stanzaliving.sfr.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MigrationAnswerDto {

    Map<String, Object> answers = new HashMap<>();

}
