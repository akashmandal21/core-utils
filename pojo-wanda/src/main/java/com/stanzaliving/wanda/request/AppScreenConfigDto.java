package com.stanzaliving.wanda.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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

        @NotNull
        private Integer position;

        @NotBlank
        private String sectionName;
        
        private boolean status;
        
        private String sectionType;
        
        private String section;
}
