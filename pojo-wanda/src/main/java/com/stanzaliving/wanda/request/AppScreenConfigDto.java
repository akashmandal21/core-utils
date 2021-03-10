package com.stanzaliving.wanda.request;

import com.stanzaliving.banner.enumeration.AppPage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AppScreenConfigDto {

        private String uuid;

        private AppPage appPage;

        private int position;

        private String sectionName;
        
        private boolean status;
        
        private String sectionType;
        
        private String section;
}
