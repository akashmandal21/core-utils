package com.stanzaliving.website.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AwsRedisPropertyNamesDto implements Serializable {

    Map<Integer, List<String>> bucketNumberPropertyNamesMap;

    LocalDate cacheBuildDate;
}
