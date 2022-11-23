package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class SupportVideoDto {

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
