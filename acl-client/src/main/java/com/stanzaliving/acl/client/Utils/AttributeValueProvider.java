package com.stanzaliving.acl.client.Utils;


import com.stanzaliving.acl.client.AttributeDto;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

public abstract class AttributeValueProvider {

    public abstract AttributeDto fillAttributeValues(HttpServletRequest request);

}
