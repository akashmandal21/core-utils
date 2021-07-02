package com.stanzaliving.core.dto;

import com.stanzaliving.core.base.utils.NumberUtils;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

@Log4j2
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

        for(int i = 0 ; i < data.length ; i++) {
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

//        log.info("this.getColumns().indexOf(columnName) : {}",this.getColumns().indexOf(columnName) );
        return data[this.getColumns().indexOf(columnName)];
    }

    protected Double getDoubleValue(String[] data, String columnName) {
        String val = data[this.getColumns().indexOf(columnName)];
        if(NumberUtils.parseableToDouble(val))
            return Double.parseDouble(val);

        return null;
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

}
