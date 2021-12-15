
package com.stanzaliving.vms.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 * @date 02/12/21
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class VendorServiceDto extends AbstractDto {

	private static final long serialVersionUID = -3719192612906788852L;

	private String serviceName;

}
