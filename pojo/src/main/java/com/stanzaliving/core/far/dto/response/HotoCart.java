package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.enums.CartStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author dhruv.mathur
 * @date 23/03/21
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HotoCart {
    HotoSection accepted;
    HotoSection rejected;
    CartStatus cartStatus;
}
