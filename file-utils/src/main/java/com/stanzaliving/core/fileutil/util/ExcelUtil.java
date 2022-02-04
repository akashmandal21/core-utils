package com.stanzaliving.core.fileutil.util;

import lombok.experimental.UtilityClass;

import static com.stanzaliving.core.fileutil.util.Constants.EXCEL_CONTENT_TYPE;

/**
 * @author jai.jain
 * @package_name com.stanzaliving.core.fileutil.util
 * @date 28/01/22
 * @time 18:49
 * @project_name residence-service
 **/
@UtilityClass
public class ExcelUtil {
    public static boolean hasExcelFormat(String contentType) {
        return EXCEL_CONTENT_TYPE.equals(contentType);
    }
}