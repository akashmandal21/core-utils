package com.stanzaliving.core.food.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserMenuPreferenceNewResponseDto implements Serializable {

    private List<UserMenuPreferenceResponseDto> userMenuPreferences;
    private Map<LocalDate, Boolean> dayWisePreferenceDetail;

}
