package com.stanzaliving.sfr.dto.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class FileUploadQuestionDto implements QuestionDetails {
    private String questionName;
    private String displayType;
    private List<HashMap<String,Boolean>> fileType;
    private String aspectRatio;
    private String imageDimension;
    private Integer maxFiles;
    private Double maxFileSize;
    private String placeHolderText;
    private boolean specificFileType;
}
