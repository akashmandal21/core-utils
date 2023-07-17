
package com.stanzaliving.analytics.logs.endpoint;

import java.util.Map;

public interface Endpoint
{
    void init();
    
    void invoke(String transactionName, Map<String, Object> endpointData);
    
}
