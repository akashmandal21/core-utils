package com.stanzaliving.food.v2.common.dto;

import com.stanzaliving.food.v2.common.constant.TagType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class TagDto implements Serializable {
    private String tagId;
    private String tagName;
    private TagType tagType;
}
