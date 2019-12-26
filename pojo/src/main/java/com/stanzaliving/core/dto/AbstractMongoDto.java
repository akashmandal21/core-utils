package com.stanzaliving.core.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractMongoDto
{
    protected String id;

    protected String uuid;

    protected Date createdAt;

    protected String createdBy;

    protected Date updatedAt;

    protected String updatedBy;
}
