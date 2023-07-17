package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.DefaulterActionType;
import com.stanzaliving.core.security.enums.UserActionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DefaulterActionTypeDTO {
    private String uuid;
    private UserActionType userActionType;
    private DefaulterActionType defaulterActionType;
    private String description;
    private boolean isLoopClosure;
}
