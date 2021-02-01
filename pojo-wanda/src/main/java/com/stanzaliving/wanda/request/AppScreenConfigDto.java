package com.stanzaliving.wanda.request;

import com.stanzaliving.banner.enumeration.AppPage;
import com.stanzaliving.wanda.enums.AppPageSection;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class AppScreenConfigDto {

        private String uuid;

        private AppPage appPage;

        private int position;

        private AppPageSection appPageSection;

}
