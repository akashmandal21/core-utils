package com.stanzaliving.ruleengine.utility;

import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.ruleengine.dto.ConditionCombinationDto;
import lombok.experimental.UtilityClass;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Objects;

@UtilityClass
public class RuleCondition {

	private void isValidCondition(ConditionCombinationDto combinationDto) {
		if (Objects.isNull(combinationDto)) {
			return;
		}

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
		if (CollectionUtils.isEmpty(combinationDtos)) {
			return true;
		}

		for (ConditionCombinationDto combinationDto : combinationDtos) {
			isValidCondition(combinationDto);
			return validateConditions(combinationDto.getConditions());
		}
		return true;
	}

}
