package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class YoutubeVideoDetailDto {
    private String uuid;

    @NotNull(message = "title is mandatory")
    private String title;

    @NotNull(message = "youtubeVideoId is mandatory")
    private String youtubeVideoId;

    @NotNull(message = "thumbnail is mandatory")
    private String thumbnail;

    @NotNull(message = "duration is mandatory")
    private String duration;
}
