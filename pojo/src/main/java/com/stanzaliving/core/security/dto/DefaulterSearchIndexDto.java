package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.base.common.dto.AbstractSearchIndexDto;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DefaulterSearchIndexDto extends AbstractSearchIndexDto {

    private String firstName;
    private String lastName;
    private String mobileNumbers;
    private String residentId;
    private String residentUuid;
    private LocalDate date;
    private String roomNumber;
}