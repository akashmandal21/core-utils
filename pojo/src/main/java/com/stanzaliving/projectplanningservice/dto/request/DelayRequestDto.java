package com.stanzaliving.projectplanningservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

/**
 * @author Ranjiht Kumar Jain
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DelayRequestDto {

    private String uuid;

    private String delayReason;

    private Date dueDate;

    private String comment;

}
