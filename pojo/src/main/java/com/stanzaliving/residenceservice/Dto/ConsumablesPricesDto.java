package com.stanzaliving.residenceservice.Dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Data;

@Getter
@Setter
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class ConsumablesPricesDto {

    @NotBlank(message = "name field cannot be empty")
    private String name;
	
    @NotBlank(message = "globalUUID field cannot be empty")
    private String globalUUID;

    @Min(value = 1, message = "itemMissingPrice must be > 0")
    @NotNull(message = "itemMissingPrice field cannot be empty")
    private Double itemMissingPrice;

    @Min(value = 1, message = "majorDamagePrice must be > 0")
    @NotNull(message = "majorDamagePrice field cannot be empty")
    private Double majorDamagePrice;

    @NotBlank(message = "majorDamageDescription field cannot be empty")
    private String majorDamageDescription;

    @Min(value = 1, message = "minorDamagePrice must be > 0")
    @NotNull(message = "minorDamagePrice field cannot be empty")
    private Double minorDamagePrice;

    @NotBlank(message = "minorDamageDescription field cannot be empty")
    private String minorDamageDescription;

}
