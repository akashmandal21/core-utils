package com.stanzaliving.core.base.exception.config;

import com.stanzaliving.core.base.exception.ApiValidationException;
import com.stanzaliving.core.base.exception.BaseMarker;
import com.stanzaliving.core.base.utils.ObjectMapperUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.impl.ThrowableProxy;
import org.apache.logging.log4j.core.layout.AbstractStringLayout;
import org.apache.logging.log4j.util.ReadOnlyStringMap;
import org.slf4j.MDC;

import java.nio.charset.Charset;
import java.util.HashMap;
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
        if (event.getThrown() == null && event.getMarker() == null) {
            return StringUtils.EMPTY;
        }
        return ObjectMapperUtil.getString(getObjectMap(event)) + StringUtils.LF;
    }

    private Map<String, Object> getObjectMap(LogEvent event) {

        Map<String, Object> map = new HashMap<>();
        try {
            map.put("@timestamp", IST_DATETIME_TIME_ZONE_FORMAT_WITH_MILLIS.format(event.getTimeMillis()));
            map.put("marker", event.getMarker() == null ? BaseMarker.APPLICATION_ERROR.getName() : event.getMarker().getName());
            map.put("message", event.getMessage().getFormattedMessage());
            map.put("threadName", event.getThreadName());
            map.put("methodName",event.getSource().getMethodName());
            map.put("className",event.getSource().getClassName() + ":" + event.getSource().getLineNumber());
            map.put("nativeMethod",event.getSource().isNativeMethod());
            ReadOnlyStringMap contextData = event.getContextData();
            contextData.forEach(map::put);
            if (event.getThrownProxy() != null) {
                map.put("stacktrace", stacktraceLineReducer(event.getThrownProxy()));
                map.put("exceptionClass", event.getThrown().getClass().getCanonicalName());
                map.put("exceptionMessage", event.getThrown().getMessage());
                if(event.getThrown().getCause() != null) {
                    map.put("causedByClass", event.getThrown().getCause().getClass().getCanonicalName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    private static String stacktraceLineReducer(ThrowableProxy tp) {
        StringBuilder sb = new StringBuilder();
        sb.append(tp.getMessage());
        for (StackTraceElement stackTraceElement : tp.getStackTrace()) {
            System.out.println(stackTraceElement);
            if (stackTraceElement.getClassName().startsWith("com.stanzaliving")) {
                sb.append(stackTraceElement);
                sb.append(StringUtils.LF);
            }
        }
        return sb.toString();
    }
}
