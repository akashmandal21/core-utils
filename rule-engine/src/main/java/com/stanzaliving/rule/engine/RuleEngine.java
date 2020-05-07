package com.stanzaliving.rule.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

import com.stanzaliving.core.base.enums.RuleOperatorEnum;
import com.stanzaliving.core.rule.engine.dto.ConditionCombinationDto;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 01-May-2020
 *
 */

@Log4j2
@UtilityClass
public class RuleEngine {

	private static Map<String, Integer> expressionVariables;

	private Boolean valid(ConditionCombinationDto combinationDto) {

		Long rightValue = Long.valueOf(combinationDto.getRightOperand());
		Long leftValue = Long.valueOf(expressionVariables.getOrDefault(combinationDto.getLeftOperand(), 0));

		RuleOperatorEnum operator = combinationDto.getOperator();

		boolean valid = true;

		switch (operator) {

			case EQ:
				valid = rightValue.equals(leftValue);
				break;

			case GT:
				valid = leftValue > rightValue;
				break;

			case GT_EQ:
				valid = leftValue >= rightValue;
				break;

			case LT:
				valid = leftValue < rightValue;
				break;

			case LT_EQ:
				valid = leftValue <= rightValue;
				break;

			default:
				break;
		}

		return valid;
	}

	private List<ConditionCombinationDto> validate(List<ConditionCombinationDto> conditionCombinationDtos, String parentAgregator, Boolean parentValue) {
		List<ConditionCombinationDto> resultDto = new ArrayList<>();
		if (CollectionUtils.isEmpty(conditionCombinationDtos)) {
			return Collections.emptyList();
		}

		for (ConditionCombinationDto conditionCombinationDto : conditionCombinationDtos) {
			List<ConditionCombinationDto> subConditionCombinations = conditionCombinationDto.getConditions();

			if (CollectionUtils.isEmpty(subConditionCombinations)) {
				if (parentValue != valid(conditionCombinationDto)) {
					resultDto.add(conditionCombinationDto);
				} else if ("any".equals(parentAgregator)) {
					return Collections.emptyList();
				}
			} else {
				String aggregator = conditionCombinationDto.getAggregator();
				Boolean value = conditionCombinationDto.getValue();
				resultDto.addAll(validate(subConditionCombinations, aggregator, value));
				return resultDto;
			}

		}
		return resultDto;
	}

	public List<ConditionCombinationDto> parseRule(ConditionCombinationDto ruleConditions, Map<String, Integer> valuesMap) {
		expressionVariables = valuesMap;
		log.info("Parsing Rule ");
		List<ConditionCombinationDto> result = validate(Collections.singletonList(ruleConditions), null, null);

		return result;
	}
}