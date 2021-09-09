package com.stanzaliving.approve.util.Convertor;

import com.stanzaliving.approve.dto.mail_template.MailConfigurationDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ObjectToList {
    public static List<MailConfigurationDto> convertObjectToList(Object obj) {
        List<MailConfigurationDto> list = new ArrayList<>();
        if (obj.getClass().isArray()) {
            list = Arrays.asList((MailConfigurationDto[])obj);
        } else if (obj instanceof Collection) {
            list = new ArrayList<>((Collection<MailConfigurationDto>)obj);
        }
        return list;
    }
}
