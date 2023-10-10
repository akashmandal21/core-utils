package com.stanzaliving.core.client.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author jai.jain
 * @package_name com.stanzaliving.core.client.dto
 * @date 06/10/23
 * @time 16:15
 * @project_name commercial-code-service
 **/

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LocationDto {

    private String locationType;
    private List<String> locations;

}