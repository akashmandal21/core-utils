package com.stanzaliving.core.food.dto.grammage.response;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 14-Apr-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseGrammageMasterCsvDto {

	@CsvBindByName(column = "SubCategoryId")
	private String subCategoryId;

	@CsvBindByName(column = "Category" )
	private String category;

	@CsvBindByName(column = "SubCategory" )
	private String subCategory;

	@CsvBindByName(column = "Breakfast" )
	private Integer breakfast;

	@CsvBindByName(column = "Lunch" )
	private Integer lunch;

	@CsvBindByName(column = "Evening Snacks" )
	private Integer eveningSnacks;

	@CsvBindByName(column = "Dinner" )
	private Integer dinner;

	@CsvBindByName(column = "Breakfast Combo" )
	private Integer breakfastCombo;

	@CsvBindByName(column = "Lunch Combo" )
	private Integer lunchCombo;

	@CsvBindByName(column = "Evening Snacks Combo" )
	private Integer eveningSnacksCombo;

	@CsvBindByName(column = "Dinner Combo" )
	private Integer dinnerCombo;

	@CsvBindByName(column = "Additive" )
	private Boolean additive;

	@CsvBindByName(column = "Override" )
	private Boolean override;
}
