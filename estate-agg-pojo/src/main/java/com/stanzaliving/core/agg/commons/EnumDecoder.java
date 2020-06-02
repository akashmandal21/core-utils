package com.stanzaliving.core.agg.commons;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class EnumDecoder {

    public static <T extends Enum<T>> T getEnum(String name, Class<T> enumClass){
        try{
            return Enum.valueOf(enumClass,name);
        }catch (Exception ex)
        {
            log.error("Error converting String {} to Enum {}",name,enumClass,ex);
            return null;
        }
    }
}
