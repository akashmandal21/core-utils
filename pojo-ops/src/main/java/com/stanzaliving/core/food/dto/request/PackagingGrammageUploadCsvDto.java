package com.stanzaliving.core.food.dto.request;

import com.opencsv.bean.CsvBindByName;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author piyush.srivastava "piyush.srivastava@stnzaliving.com"
 *
 * @since 19-Oct-2020
 *
 * @version 1.0
 */


@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PackagingGrammageUploadCsvDto {

	@CsvBindByName(column = "Packaging Name")
	private String packagingName;

	@CsvBindByName(column = "Packaging Grammage")
	private Double grammage;
}
