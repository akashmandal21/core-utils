package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UploadedSignATLImagesAndStatus {

    List<String> s3Paths;

    boolean allImagesUploadedStatus;

}
