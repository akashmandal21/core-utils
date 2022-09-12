package com.stanzaliving.transformations.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class FbCatalogIdRequestDto {
    
    private String residenceName;
    private String fbCatalogId;
}
