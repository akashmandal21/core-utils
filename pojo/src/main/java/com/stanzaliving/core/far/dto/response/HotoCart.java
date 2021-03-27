package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.enums.CartStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author dhruv.mathur
 * @date 23/03/21
 */
@Getter
@Setter
@SuperBuilder
public class HotoCart {
    HotoSection accepted;
    HotoSection rejected;
    CartStatus cartStatus;
}
