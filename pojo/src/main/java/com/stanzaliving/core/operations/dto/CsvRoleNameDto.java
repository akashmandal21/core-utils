package com.stanzaliving.core.operations.dto;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CsvRoleNameDto {

    private String firstHeader;
    private String secondHeader;
}
