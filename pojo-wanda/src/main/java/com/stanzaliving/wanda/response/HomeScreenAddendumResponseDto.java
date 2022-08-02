package com.stanzaliving.wanda.response;

import lombok.Setter;

import java.util.List;

@Setter
public class HomeScreenAddendumResponseDto {
    
    private List<AddendumResponseDto> dismissibleAddendums;
    private List<AddendumResponseDto> nonDismissibleAddendums;
}
