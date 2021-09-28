package com.stanzaliving.core.security.dto;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentCurrentCommercialsMigrationDTO {

    @JsonSetter(value = "ID")
    private Integer id;

    @JsonSetter(value = "BOOKING_ID")
    private String bookingId;

    @JsonSetter(value = "REFUNDABLE_SECURITY")
    private Integer refundableSecurity;
}
