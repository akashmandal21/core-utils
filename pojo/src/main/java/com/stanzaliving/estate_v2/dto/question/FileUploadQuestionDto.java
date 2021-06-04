package com.stanzaliving.estate_v2.dto.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class FileUploadQuestionDto implements QuestionDetails{

    private String displayType;
    private List<String> fileType;
    private String aspectRatio;
    private String imageDimension;
    private Integer maxFiles;
    private Integer maxFileSize;
    private String placeHolderText;
}
