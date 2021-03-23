package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.enums.CartStatus;

/**
 * @author dhruv.mathur
 * @date 23/03/21
 */
public class HotoCart {
    HotoSection accepted;
    HotoSection rejected;
    CartStatus cartStatus;
}
