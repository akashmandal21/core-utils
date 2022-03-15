package com.stanzaliving.po.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoCsvResponseDto {

    private List<String> uuids;
}
