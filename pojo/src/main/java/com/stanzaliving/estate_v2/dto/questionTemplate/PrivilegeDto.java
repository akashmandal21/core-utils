package com.stanzaliving.estate_v2.dto.questionTemplate;

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
    private List<String> fill;
    private List<String> approve;
    private List<String> view;
}
