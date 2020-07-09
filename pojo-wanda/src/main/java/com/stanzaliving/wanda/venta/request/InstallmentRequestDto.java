package com.stanzaliving.wanda.venta.request;

import com.stanzaliving.wanda.enums.InstallmentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstallmentRequestDto {
    private String bookingUuid;
    private InstallmentTypeEnum InstallmentType;
}
