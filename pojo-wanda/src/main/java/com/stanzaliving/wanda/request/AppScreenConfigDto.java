package com.stanzaliving.wanda.request;

import com.stanzaliving.banner.enumeration.AppPage;
import com.stanzaliving.wanda.enums.AppPageSection;

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

        private AppPageSection appPageSection;
        
        private boolean status;

}
