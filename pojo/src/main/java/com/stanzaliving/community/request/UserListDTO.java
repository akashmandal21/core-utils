package com.stanzaliving.community.request;

import com.stanzaliving.community.enums.UserList;
import com.stanzaliving.genericdashboard.validation.DraftValidation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserListDTO {
    @NotNull(groups = {Default.class, DraftValidation.class})
    private UserList userListType;
    private EventLocationDTO specificLocation;
    private FileUploadDTO fileUploadDTO;
}
