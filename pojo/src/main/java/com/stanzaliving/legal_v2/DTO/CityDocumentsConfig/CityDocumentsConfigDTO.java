package com.stanzaliving.legal_v2.DTO.CityDocumentsConfig;

import com.stanzaliving.core.dto.AbstractMongoDto;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CityDocumentsConfigDTO extends AbstractMongoDto {

    @NotNull(message = "City Name Must Not be NULL or EMPTY")
    private String cityName;

    @Valid
    private List<FoldersAndDocumentsDTO> foldersAndDocuments;
}
