package com.stanzaliving.core.sqljpa.conveter;

import com.stanzaliving.core.base.utils.DateUtil;
import lombok.SneakyThrows;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

/**
 * @author dhruv.mathur
 * @date 30/07/21
 */
@Converter(autoApply = true)
public class LocalDateToStringAttributeConverter implements AttributeConverter<Date,String> {


    @Override
    public String convertToDatabaseColumn(Date attribute) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        if(Objects.isNull(attribute))
            return null;
        return dateFormat.format(attribute);
    }

    @SneakyThrows
    @Override
    public Date convertToEntityAttribute(String dbData) {
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dbData);
        return date1;
    }
}
