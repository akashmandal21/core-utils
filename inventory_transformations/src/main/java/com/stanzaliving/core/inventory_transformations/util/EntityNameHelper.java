package com.stanzaliving.core.inventory_transformations.util;

public class EntityNameHelper {

    public static String getFullyQualifiedEntityName(String packageName, String tableName, String suffix) {
        return getFullyQualifiedEntityName(packageName, EntityNameHelper.getEntityName(tableName, suffix));
    }

    public static String getFullyQualifiedEntityName(String packageName, String entityName) {
        return packageName + "." + entityName;
    }

    public static String getEntityName(String tableName, String suffix) {
        tableName = parseSimpleName(tableName);
        String fieldName = parseFieldName(tableName);
        return fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1) + suffix;
    }

    public static String getServiceBeanName(String serviceClassName) {
        return serviceClassName.substring(0, 1).toLowerCase() + serviceClassName.substring(1);
    }

    /**
     * StringHelper.class.getSimpleName()效果一致
     */
    public static String parseSimpleName(String className) {
        if (className.contains(".")) {
            return className.substring(className.lastIndexOf('.') + 1);
        }
        return className;
    }

    /**
     * <br>
     * column_name -> columnName <br>
     * column_name_ -> columnName <br>
     * _column_name_ -> columnName <br>
     * COLUMN_NAME -> columnName <br>
     */
    public static String parseFieldName(String columnName) {
        if (!columnName.contains("_")) {
            return columnName;
        }
        columnName = columnName.toLowerCase();
        if (columnName.startsWith("is_")) {
            columnName = columnName.substring("is_".length());
        }
        if (!columnName.contains("_")) {
            return columnName;
        } else {
            int length = columnName.length();
            StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                if ('_' == columnName.charAt(i) && i < length - 1) {
                    sb.append(String.valueOf(columnName.charAt(++i)).toUpperCase());
                } else {
                    sb.append(columnName.charAt(i));
                }
            }
            String fieldName = sb.toString().replace("_", "");
            char first = fieldName.charAt(0);
            if (first < 'a') {
                fieldName = fieldName.replaceFirst(String.valueOf(first), String.valueOf(first).toLowerCase());
            }
            return fieldName;
        }
    }



}
