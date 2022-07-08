package com.stanzaliving.core.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
//@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CountryDTO {

    @Id
    @GeneratedValue
    @Column(name="COUNTRY_ID")
    private int countryId;

    @Column(name="NAME",nullable=false)
    private String name;

    @Column(name="CODE")
    private String code;

    @Column(name="NATIONALITY")
    private String nationality;

}