package com.stanzaliving.food.v2.grammage.response;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import com.stanzaliving.food.v2.grammage.constant.GrammageCsvConstants;
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

	@CsvBindByName(column = GrammageCsvConstants.SUB_CAT_ID)
	@CsvBindByPosition(position = 0)
	private String subCategoryId;

	@CsvBindByName(column = GrammageCsvConstants.CAT_NAME )
	@CsvBindByPosition(position = 1)
	private String category;

	@CsvBindByName(column = GrammageCsvConstants.SUB_CAT_NAME )
	@CsvBindByPosition(position = 2)
	private String subCategory;

	@CsvBindByName(column = GrammageCsvConstants.BREAKFAST )
	@CsvBindByPosition(position = 3)
	private Integer breakfast;

	@CsvBindByName(column = GrammageCsvConstants.LUNCH )
	@CsvBindByPosition(position = 4)
	private Integer lunch;

	@CsvBindByName(column = GrammageCsvConstants.LUNCH_TIFFIN )
	@CsvBindByPosition(position = 5)
	private Integer lunchTiffin;

	@CsvBindByName(column = GrammageCsvConstants.EVENING_SNACKS )
	@CsvBindByPosition(position = 6)
	private Integer eveningSnacks;

	@CsvBindByName(column = GrammageCsvConstants.DINNER )
	@CsvBindByPosition(position = 7)
	private Integer dinner;

	@CsvBindByName(column = GrammageCsvConstants.BREAKFAST_COMBO )
	@CsvBindByPosition(position = 8)
	private Integer breakfastCombo;

	@CsvBindByName(column = GrammageCsvConstants.LUNCH_COMBO )
	@CsvBindByPosition(position = 9)
	private Integer lunchCombo;

	@CsvBindByName(column = GrammageCsvConstants.EVENING_SNACKS_COMBO )
	@CsvBindByPosition(position = 10)
	private Integer eveningSnacksCombo;

	@CsvBindByName(column = GrammageCsvConstants.DINNER_COMBO )
	@CsvBindByPosition(position = 11)
	private Integer dinnerCombo;

	@CsvBindByName(column = GrammageCsvConstants.ADDITIVE )
	@CsvBindByPosition(position = 12)
	private Boolean additive;

	@CsvBindByName(column = GrammageCsvConstants.OVERRIDE )
	@CsvBindByPosition(position = 13)
	private Boolean override;

	/**
	 * This field is added to add upload remarks in response while bulk uploading.
	 * This is not being used anywhere in for updating values
	 */
	@CsvBindByName(column = GrammageCsvConstants.REMARKS )
	@CsvBindByPosition(position = 14)
	private String remarks;
}
