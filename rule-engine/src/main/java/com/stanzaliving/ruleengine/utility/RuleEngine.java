package com.stanzaliving.ruleengine.utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.enums.RuleOperatorEnum;
import com.stanzaliving.ruleengine.dto.AddRuleRequestDto;
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
		if (
				(operator == RuleOperatorEnum.EQ) && !(rightValue.equals(leftValue))
						|| (operator == RuleOperatorEnum.GT) && !(rightValue <= leftValue)
						|| (operator == RuleOperatorEnum.GT_EQ) && !(rightValue < leftValue)
						|| (operator == RuleOperatorEnum.LT) && !(rightValue >= leftValue)
						|| (operator == RuleOperatorEnum.LT_EQ) && !(rightValue > leftValue)
		){
			return false;
		}
		return true;
	}


	private List<ConditionCombinationDto> validate(List<ConditionCombinationDto> conditionCombinationDtos, String parentAgregator, Boolean parentValue){
		List<ConditionCombinationDto> resultDto = new ArrayList<>();
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



	public List<ConditionCombinationDto> parseRule(ConditionCombinationDto ruleConditions, Map<String, Integer> valuesMap) throws IOException {
		expressionVariables = valuesMap;
		log.info("Parsing Rule ");
		List<ConditionCombinationDto> result = validate(Arrays.asList(ruleConditions), null, null);

		return result;
	}
}
