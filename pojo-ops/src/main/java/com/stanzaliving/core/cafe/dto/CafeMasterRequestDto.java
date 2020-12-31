package com.stanzaliving.core.cafe.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.cafe.enums.CafeTags;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMasterRequestDto extends AbstractDto {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @NotBlank(message = "Cafe Name is mandatory")
    private String cafeName;

    @NotNull(message = "Tags selection is mandatory")
    private List<CafeTags> tags;

    @NotBlank(message = "AddressLine1 filling is mandatory")
    private String addressLine1;

    @NotBlank(message = "AddressLine2 filling is mandatory")
    private String addressLine2;

    @NotBlank(message = "City selection is mandatory")
    private String cityId;

    @NotBlank(message = "State selection is mandatory")
    private String stateId;

    @NotBlank(message = "Country selection is mandatory")
    private String countryId;

    @NotEmpty(message = "There should be at least one Kitchen")
    private List<BaseKitchenDto> baseKitchens;

    @NotNull(message = "Pincode is mandatory")
    private Integer pincode;

    private List<ResidenceMicromarketDto> residences;

}