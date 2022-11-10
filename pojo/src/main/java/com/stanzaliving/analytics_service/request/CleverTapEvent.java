package com.stanzaliving.analytics_service.request;

import lombok.*;

import java.util.List;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CleverTapEvent {

    List<CleverTapEventIdentity> d;
}
