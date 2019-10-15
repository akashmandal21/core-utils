package com.stanzaliving.core.utilservice.annotations.validator;

import java.time.LocalDate;
import java.util.Calendar;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.stanzaliving.core.utilservice.annotations.ValidLocalDate;

public class ValidLocalDateValidator implements ConstraintValidator<ValidLocalDate, LocalDate> {

   private int minYear;
   private int maxYear;

   public void initialize(ValidLocalDate constraint) {
      this.minYear = constraint.minyear();
      this.maxYear = constraint.maxyear();
   }

   public boolean isValid(LocalDate obj, ConstraintValidatorContext context) {
      if(obj != null)
      {
         int year = Calendar.getInstance().get(Calendar.YEAR);
         if (obj.getYear() > year + maxYear || obj.getYear() < year + minYear) {
            return false;
         }
      }
      return true;
   }
}
