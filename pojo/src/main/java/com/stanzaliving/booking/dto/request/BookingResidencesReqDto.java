package com.stanzaliving.booking.dto.request;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookingResidencesReqDto {
    List<String> residenceUuid;
}
