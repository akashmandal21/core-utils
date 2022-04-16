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
            map.put("marker", event.getMarker() == null ? BaseMarker.APPLICATION_ERROR : event.getMarker());
            map.put("message", event.getMessage().getFormattedMessage());
            map.put("threadName", event.getThreadName());
            map.put("methodName",event.getSource().getMethodName());
            map.put("fileName",event.getSource().getFileName());
            map.put("className",event.getSource().getClassName());
            map.put("lineNumber",event.getSource().getLineNumber());
            map.put("nativeMethod",event.getSource().isNativeMethod());
            ReadOnlyStringMap contextData = event.getContextData();
            contextData.forEach(map::put);
            if (event.getThrownProxy() != null) {
                map.put("stacktrace", event.getThrownProxy().getCauseStackTraceAsString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

//    private static String stacktraceLineReducer(ThrowableProxy tp) {
//        StringBuilder sb = new StringBuilder();
//        StackTraceElementProxy[] stepArray = tp.getCauseStackTraceAsString("");
//        int commonFrames = tp.getCommonElementCount();
//        int length = stepArray.length - commonFrames > MAX_STACK_TRACE_LINES ? MAX_STACK_TRACE_LINES : stepArray.length - commonFrames;
//        for (int i = 0; i < length; i++) {
//            StackTraceElementProxy step = stepArray[i];
//            ThrowableProxyUtil.indent(sb, 1);
//            ThrowableProxyUtil.subjoinSTEP(sb, step);
//            sb.append(CoreConstants.LINE_SEPARATOR);
//        }
//
//        if (commonFrames > 0) {
//            ThrowableProxyUtil.indent(sb, 1);
//            sb.append("... ").append(commonFrames).append(" common frames omitted").append(CoreConstants.LINE_SEPARATOR);
//        }
//
//        return sb.toString();
//    }
}
