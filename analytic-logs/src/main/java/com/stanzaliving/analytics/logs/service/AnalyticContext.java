package com.stanzaliving.analytics.logs.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


final class AnalyticContext
{
    private Map<String, Object> keyValueStore;
    private Stack<TransactionKeyStore> transactionKeyStore;

    public Map<String, Object> getKeyValueStore()
    {
        if (keyValueStore == null)
            keyValueStore = new HashMap<String, Object>();
        return keyValueStore;
    }

    public Stack<TransactionKeyStore> getTransactionKeyStore()
    {
        if (transactionKeyStore == null)
            transactionKeyStore = new Stack<TransactionKeyStore>();
        return transactionKeyStore;
    }
}