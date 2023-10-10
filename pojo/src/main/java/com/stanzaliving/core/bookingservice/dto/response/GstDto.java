package com.stanzaliving.core.bookingservice.dto.response;

import com.stanzaliving.core.bookingservice.dto.GstName;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author jai.jain
 * @package_name com.stanzaliving.core.bookingservice.dto.response
 * @date 16/07/22
 * @time 15:09
 * @project_name core-utils
 **/

@Getter
@NoArgsConstructor
public class GstDto {
    private Double gstValue;
    private GstName gstName;
}