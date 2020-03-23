/**
 * 
 */
package com.stanzaliving.qaservice.dto.metadata;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import com.stanzaliving.qaservice.dto.QuestionResponseDto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class OnTapExpandedQuestionDto {

    List<OnTapExpandedOptionsDto> options = new ArrayList<>();

     public List<OnTapExpandedOptionsDto> getSortedOptions() {
        TreeMap<Integer, Integer> minQuestionOrderOptionMap = new TreeMap<>();
        for (Integer itr = 0; itr < options.size() ; itr++) {
            Integer min = Integer.MAX_VALUE;
            for(QuestionResponseDto questionResponseDto : options.get(itr).getQuestions()) {
                if (questionResponseDto.getOrderNum() < min) {
                    min = questionResponseDto.getOrderNum();
                }
            }
            while(minQuestionOrderOptionMap.get(min) != null) {
                min++;
            }
            minQuestionOrderOptionMap.put(min, itr);
        }
        List<OnTapExpandedOptionsDto> sortedOptions = new ArrayList<>();
        for (Integer itr : minQuestionOrderOptionMap.values()) {
            sortedOptions.add(options.get(itr));
        }
        return sortedOptions;
    }
}
