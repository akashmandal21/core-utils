package com.stanzaliving.core.ims.client.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author harman
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BrokerDocumentRequestDTO {

    private int id;

    private String imgURL;

    private String type;  //pan

    private String nameOnDocument;

    private String documentId;

    private String filePath;

}
