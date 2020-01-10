package com.stanzaliving.qaservice.dto.metadata;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SingleOrMultipleChoice {
    List<OptionsMetadataDto> options = new ArrayList<>();
}
