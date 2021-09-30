package com.stanzaliving.core.user.acl.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UuidByEmailDto {

    private String email;
    private String uuid;
}
