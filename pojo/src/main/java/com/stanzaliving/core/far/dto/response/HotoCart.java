package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.enums.CartStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author dhruv.mathur
 * @date 23/03/21
 */
@Data
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HotoCart {
    HotoSection accepted;
    HotoSection rejected;
    CartStatus cartStatus;
    Long totalAssets;
    Long scannedAssets;

}
