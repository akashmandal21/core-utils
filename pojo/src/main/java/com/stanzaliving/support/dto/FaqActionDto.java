package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.FaqStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FaqActionDto {
    private String level;
    private Date actionAt;
    private String actionBy;
}
