/**
 * 
 */
package com.stanzaliving.core.estate.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author raj.kumar
 *
 */
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class QuestionDto extends AbstractDto {

    private String questionIdentifier;

    private Integer screenGroupNum;

    private Integer screenNum;
    
    private String questionText;

}
