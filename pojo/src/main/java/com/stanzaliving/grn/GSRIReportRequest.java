package com.stanzaliving.grn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GSRIReportRequest {

    private String id;

    private String subId;

    List<GSRITuple> gsriTuples;

}
