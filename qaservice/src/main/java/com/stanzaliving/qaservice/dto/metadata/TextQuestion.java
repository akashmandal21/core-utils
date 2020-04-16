package com.stanzaliving.qaservice.dto.metadata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TextQuestion {
    String placeHolder;
    String validationRegex;
    String unitIdentifier;
}
