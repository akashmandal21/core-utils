package com.stanzaliving.core.food.dto.grammage.response;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
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

	private final static long serialVersionUID = 223232L;

	@CsvBindByName(column = "SubCategoryId")
	@CsvBindByPosition(position = 0)
	private String subCategoryId;

	@CsvBindByName(column = "Category" )
	@CsvBindByPosition(position = 1)
	private String category;

	@CsvBindByName(column = "SubCategory" )
	@CsvBindByPosition(position = 2)
	private String subCategory;

	@CsvBindByName(column = "Breakfast" )
	@CsvBindByPosition(position = 3)
	private Integer breakfast;

	@CsvBindByName(column = "Lunch" )
	@CsvBindByPosition(position = 4)
	private Integer lunch;

	@CsvBindByName(column = "Evening Snacks" )
	@CsvBindByPosition(position = 5)
	private Integer eveningSnacks;

	@CsvBindByName(column = "Dinner" )
	@CsvBindByPosition(position = 6)
	private Integer dinner;

	@CsvBindByName(column = "Breakfast Combo" )
	@CsvBindByPosition(position = 7)
	private Integer breakfastCombo;

	@CsvBindByName(column = "Lunch Combo" )
	@CsvBindByPosition(position = 8)
	private Integer lunchCombo;

	@CsvBindByName(column = "Evening Snacks Combo" )
	@CsvBindByPosition(position = 9)
	private Integer eveningSnacksCombo;

	@CsvBindByName(column = "Dinner Combo" )
	@CsvBindByPosition(position = 10)
	private Integer dinnerCombo;

	@CsvBindByName(column = "Additive" )
	@CsvBindByPosition(position = 11)
	private Boolean additive;

	@CsvBindByName(column = "Override" )
	@CsvBindByPosition(position = 12)
	private Boolean override;

	/**
	 * This field is added to add upload remarks in response while bulk uploading.
	 * This is not being used anywhere in for updating values
	 */
	@CsvBindByName(column = "Remarks" )
	@CsvBindByPosition(position = 13)
	private String remarks;
}
