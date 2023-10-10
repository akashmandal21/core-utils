package com.stanzaliving.core.user.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class UserProfileRequestDto {

    List<String> userUuids;
}
