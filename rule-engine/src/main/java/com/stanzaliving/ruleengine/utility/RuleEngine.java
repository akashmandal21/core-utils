package com.stanzaliving.ruleengine.utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stanzaliving.core.base.enums.RuleOperatorEnum;
import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.ruleengine.dto.AddRuleRequestDto;
import com.stanzaliving.ruleengine.dto.ConditionCombinationDto;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.*;

@Log4j2
@UtilityClass
public class RuleEngine {

	private static Map<String, Integer> expressionVariables;



	private void isValidCondition(ConditionCombinationDto combinationDto) {
		if (CollectionUtils.isEmpty(combinationDto.getConditions())){
			if (
					StringUtils.isEmpty(combinationDto.getLeftOperand())
							|| StringUtils.isEmpty(combinationDto.getRightOperand())
							|| Objects.isNull(combinationDto.getOperator())
			) {
				throw new StanzaException("Invalid Conditions supplied. left operand , right operand and operator is required.");
			}
		} else {
			if (!(
					StringUtils.isEmpty(combinationDto.getLeftOperand())
							&& StringUtils.isEmpty(combinationDto.getRightOperand())
							&& Objects.isNull(combinationDto.getOperator())
			)) {
				throw new StanzaException("Invalid Conditions supplied. left operand , right operand and operator can not be used when condition combinations is being used.");
			}

			if (StringUtils.isEmpty(combinationDto.getAggregator()) || (combinationDto.getValue() == null)) {
				throw new StanzaException("Aggregator and value are required with condition combination.");
			}
		}
	}


	public Boolean validateConditions(List<ConditionCombinationDto> combinationDtos){
		for (ConditionCombinationDto combinationDto : combinationDtos) {
			isValidCondition(combinationDto);
			return validateConditions(combinationDto.getConditions());
		}
		return true;
	}



	private Boolean valid(ConditionCombinationDto combinationDto) {
		Long rightValue = Long.valueOf(combinationDto.getRightOperand());
		Long leftValue = Long.valueOf(combinationDto.getLeftOperand());
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



	public List<ConditionCombinationDto> parseRule(String ruleConditions, Map<String, Integer> valuesMap) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		expressionVariables = valuesMap;
		AddRuleRequestDto ruleRequestDto = objectMapper.readValue(ruleConditions, AddRuleRequestDto.class);
		log.info("Parsing Rule ");

		ConditionCombinationDto weeklyConditions = ruleRequestDto.getWeeklyRule();
		ConditionCombinationDto dailyConditions = ruleRequestDto.getDailyRule();
		List<ConditionCombinationDto> result = validate(Arrays.asList(weeklyConditions), null, null);
		result.addAll(validate(Arrays.asList(dailyConditions), null, null));

		return result;
	}
}
