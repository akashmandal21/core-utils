package com.stanzaliving.core.base.common.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ListingCountDto extends ListingDto {
    private static final long serialVersionUID = -3156825960862416907L;
    private long count; 
}
