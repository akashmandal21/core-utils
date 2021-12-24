package com.stanzaliving.core.dto;

import com.stanzaliving.core.base.utils.NumberUtils;
import lombok.Data;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

@Data
public abstract class AbstractCsvDto {

    Map<String,String> dynamicData;
    Set<String> dynamicColumns;
    List<String> columns;
    String[] data;
    Integer rowId;
    String status;

    protected AbstractCsvDto(String[] headerRecord, String[] data, int rowId) {
        this(headerRecord,data);
        this.rowId = rowId;
    }

    protected AbstractCsvDto(String[] headerRecord,String[] data) {
        this.columns = new ArrayList<>(Arrays.asList(headerRecord));
        this.data = data;
        this.dynamicData = new HashMap<>();
        this.dynamicColumns = new HashSet<>(columns);
        addFixedColumns();
        fillFixedColumns(data);
        fillDynamicColumns(data);
    }

    protected abstract void addFixedColumns();

    protected abstract void fillFixedColumns(String[] data);

    protected void addToFixedColumns(String columnName) {
        this.dynamicColumns.remove(columnName);
    }

    private void fillDynamicColumns(String[] data) {
        for(int i = 0 ; i < columns.size() ; i++) {
            if(dynamicColumns.contains(columns.get(i))) {
                if(!StringUtils.isBlank(data[i])) {
                    dynamicData.put(columns.get(i), data[i]);
                }
            }
        }
    }

    protected boolean checkColumnExist(String columnName) {
        return this.getColumns().contains(columnName);
    }

    protected String getStringValue(String[] data, String columnName) {
        return data[this.getColumns().indexOf(columnName)];
    }

    protected Double getDoubleValue(String[] data, String columnName) {
        if(this.getColumns().indexOf(columnName)<data.length) {
            String val = data[this.getColumns().indexOf(columnName)];
            if(NumberUtils.parseableToDouble(val))
                return Double.parseDouble(val);
        }
        return null;
    }

    public static String escapeSpecialCharacters(String inputString) {
        if(StringUtils.isNotBlank(inputString)) {
            return StringEscapeUtils.unescapeHtml4(inputString.replace(","," ").replace("\n", " ")
                    .replace("\t", " "));
        } else {
            return StringUtils.EMPTY;
        }

    }

    public static <T extends AbstractCsvDto> List<String[]> prepareResponseCsv(List<T> csvDtos) {

        List<String[]> data = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(csvDtos)&&csvDtos.stream().findAny().isPresent()) {
            List<String> columns = csvDtos.stream().findAny().get().columns;
            data.add(ArrayUtils.addAll(new String[]{"Status"},columns.toArray(new String[0]) ));
            csvDtos.sort(Comparator.comparing(AbstractCsvDto::getRowId));
            for (AbstractCsvDto dto : csvDtos) {
                data.add(ArrayUtils.addAll(new String[]{dto.getStatus()},dto.getData()));
            }
        }
        return data;

    }

    public static <T extends AbstractCsvDto> List<String[]> prepareRequestCsv(List<T> csvDtos) {

        List<String[]> data = new ArrayList<>();
        if(CollectionUtils.isNotEmpty(csvDtos)&&csvDtos.stream().findAny().isPresent()) {
            List<String> columns = csvDtos.stream().findAny().get().columns;
            data.add(ArrayUtils.addAll(columns.toArray(new String[0])));
            csvDtos.sort(Comparator.comparing(AbstractCsvDto::getRowId));
            for (AbstractCsvDto dto : csvDtos) {
                data.add(ArrayUtils.addAll(dto.getData()));
            }
        }
        return data;

    }

    public LocalDate getDateValue(String[] data, String columnName) {
        try {
            return LocalDate.parse(data[this.getColumns().indexOf(columnName)]);
        } catch(Exception e) {
            return null;
        }
    }

    public Set<String> getSetOfStrings(String[] data, String columnName, String delimiter) {

        if(StringUtils.isNotBlank(data[this.getColumns().indexOf(columnName)])) {
            return new HashSet<>(Arrays.asList(data[this.getColumns().indexOf(columnName)].split(delimiter)));
        } else {
            return new HashSet<>();
        }
        
    }

}
