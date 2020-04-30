package com.stanzaliving.ruleengine.utility;

import com.stanzaliving.core.base.enums.RuleOperatorEnum;
import com.stanzaliving.ruleengine.dto.ConditionCombinationDto;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;

import java.io.IOException;
import java.util.*;

@Log4j2
@UtilityClass
public class RuleEngine {

	private static Map<String, Integer> expressionVariables;


	private Boolean valid(ConditionCombinationDto combinationDto) {
		Long rightValue = Long.valueOf(combinationDto.getRightOperand());
		Long leftValue = Long.valueOf(expressionVariables.get(combinationDto.getLeftOperand()));
		RuleOperatorEnum operator = combinationDto.getOperator();

		switch (operator) {
			case EQ:
				return rightValue.equals(leftValue);
			case GT:
				return rightValue > leftValue;
			case GT_EQ:
				return rightValue >= leftValue;
			case LT:
				return rightValue < leftValue;
			case LT_EQ:
				return rightValue <= leftValue;
		}
		return true;
	}


	private List<ConditionCombinationDto> validate(List<ConditionCombinationDto> conditionCombinationDtos, String parentAgregator, Boolean parentValue){
		List<ConditionCombinationDto> resultDto = new ArrayList<>();
		if (CollectionUtils.isEmpty(conditionCombinationDtos)) {
			return Collections.emptyList();
		}

		for (ConditionCombinationDto conditionCombinationDto : conditionCombinationDtos) {
			List<ConditionCombinationDto> subConditionCombinations = conditionCombinationDto.getConditions();

			if (CollectionUtils.isEmpty(subConditionCombinations)){
				if (parentValue != valid(conditionCombinationDto)) {
					resultDto.add(conditionCombinationDto);
				} else if ("any".equals(parentAgregator)) {
					return Collections.emptyList();
				}
			}
			else {
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
		List<ConditionCombinationDto> result = validate(Arrays.asList(ruleConditions), null, null);

		return result;
	}
}
