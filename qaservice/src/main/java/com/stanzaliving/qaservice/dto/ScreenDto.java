package com.stanzaliving.qaservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScreenDto {
    String name;
    String heading;
    List<SubScreenDto> screen = new ArrayList<>();
}
