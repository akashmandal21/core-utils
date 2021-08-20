package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.enums.TransferScanStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author dhruv.mathur
 * @date 12/04/21
 */
@Data
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ConfirmHotoDto {
    private TransferScanStatus message;
}
