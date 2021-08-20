package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.enums.CartStatus;
import com.stanzaliving.core.far.enums.CartType;
import com.stanzaliving.core.far.enums.TransferScanStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * @author dhruv.mathur
 * @date 23/03/21
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AddAssetToCartDto {
    private String cartUuid;
    private CartType cartType;
    private BigDecimal numberOfItemCodes;
    private CartStatus cartStatus;
    private TransferScanStatus message;
}
