package com.stanzaliving.analytics_service.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CleverTapEvent {

    List<CleverTapEventIdentity> d;
}
