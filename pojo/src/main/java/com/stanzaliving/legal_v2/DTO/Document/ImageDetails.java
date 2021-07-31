package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ImageDetails {

    private int index;

    private MultipartFile image;

    private String filePath;
}
