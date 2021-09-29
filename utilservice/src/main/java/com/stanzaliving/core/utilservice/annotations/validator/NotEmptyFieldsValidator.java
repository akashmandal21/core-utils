package com.stanzaliving.core.utilservice.annotations.validator;

import com.stanzaliving.core.base.exception.StanzaException;
import com.stanzaliving.core.utilservice.annotations.AllowedStringList;
import lombok.SneakyThrows;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
//import javax.validation.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class NotEmptyFieldsValidator implements ConstraintValidator<AllowedStringList, List<String>> {
    @Override
    public void initialize(AllowedStringList constraintAnnotation) {

    }

    @SneakyThrows
    @Override
    public boolean isValid(List<String> values, ConstraintValidatorContext context) {
        List<String> exceptionMessage = new ArrayList<>();
        if(values.size() == 0){
            throw new StanzaException("List should have atleast one element");
        }
        else {
            IntStream.range(0, values.size())
                    .forEach(index -> {
                                if(values.get(index) == null || values.get(index).trim().isEmpty() )
                                    exceptionMessage.add("Index "+(index)+" is invalid due to empty | null string");
                                else if(values.get(index).trim().length() > 50){
                                    exceptionMessage.add("Index "+(index)+" is invalid due to string length greater than 50");
                                }
                    }
                    );
            if(!exceptionMessage.isEmpty()){
                String res = String.join(",", exceptionMessage);
                throw new StanzaException(res);
            }
        }
        return true;
    }

}