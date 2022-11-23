package com.stanzaliving.wanda.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MonthAndYear {

    private String month;

    private Integer year;

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;

        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        MonthAndYear monthAndYear = (MonthAndYear) obj;
        return (monthAndYear.month.equals(this.month)  && Objects.equals(monthAndYear.year, this.year));
    }

    @Override
    public int hashCode()
    {
        return this.year;
    }
}