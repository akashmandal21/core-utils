package com.stanzaliving.po.model;

import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoCsvResponseDto {

    private List<String> uuids;
    private Map<String, LocalDate> poCreatedAtMap;
    private String message;
}
