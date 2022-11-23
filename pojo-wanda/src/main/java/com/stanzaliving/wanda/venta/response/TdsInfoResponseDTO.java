package com.stanzaliving.wanda.venta.response;

import lombok.Data;

@Data
public class TdsInfoResponseDTO {
    private String amount;
    private String tdsWithPan;
    private String tdsWithoutPan;
}
