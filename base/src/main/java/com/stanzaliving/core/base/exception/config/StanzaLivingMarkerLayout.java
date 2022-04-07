package com.stanzaliving.core.base.exception.config;

import com.stanzaliving.core.base.exception.ExceptionMarker;
import com.stanzaliving.core.base.utils.ObjectMapperUtil;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.layout.AbstractStringLayout;
import org.slf4j.MDC;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.TimeZone;

@Plugin(name = "StanzaLivingMarkerLayout", category = "Core", elementType = "layout", printObject = true)
public class StanzaLivingMarkerLayout extends AbstractStringLayout{
    
    public static final String GUID = "guid";
    public static final String LUID = "luid";
    public static final String REQUEST_PATH = "RequestPath";
    public static final String QUERY_STRING = "QueryString";
    public static final String REQ_UID = "reqUuid";
    private static final FastDateFormat IST_DATETIME_TIME_ZONE_FORMAT_WITH_MILLIS = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss.SSSZZ", TimeZone.getTimeZone("IST"));

    protected StanzaLivingMarkerLayout(Charset charset) {
        super(charset);
    }

    @PluginFactory
    public static StanzaLivingMarkerLayout createLayout(@PluginAttribute(value = "charset", defaultString = "UTF-8") Charset charset) {
        return new StanzaLivingMarkerLayout(charset);
    }

    @Override
    public String toSerializable(LogEvent event) {
        return ObjectMapperUtil.getString(getObjectMap(event));
    }

    private Map<String, Object> getObjectMap(LogEvent event) {
        Map<String, Object> map = new HashedMap();
        map.put("@timestamp", IST_DATETIME_TIME_ZONE_FORMAT_WITH_MILLIS.format(event.getTimeMillis()));
        ExceptionMarker exceptionMarker = (ExceptionMarker) event.getMessage().getParameters()[0];
        map.put("errorCode", exceptionMarker.getErrorCode());
        map.put("message", exceptionMarker.getMessage());
        map.put("threadName", event.getThreadName());
        map.put("level", event.getLevel().toString());
        map.put("methodName",event.getSource().getMethodName());
        map.put("fileName",event.getSource().getFileName());
        map.put("className",event.getSource().getClassName());
        map.put("lineNumber",event.getSource().getLineNumber());
        map.put("nativeMethod",event.getSource().isNativeMethod());
        map.put(GUID, MDC.get(GUID));
        map.put(LUID, MDC.get(LUID));
        map.put("reqPath", MDC.get(REQUEST_PATH));
        map.put("queryParams", MDC.get(QUERY_STRING));
        map.put(REQ_UID, MDC.get(REQ_UID));
        return map;
    }
}