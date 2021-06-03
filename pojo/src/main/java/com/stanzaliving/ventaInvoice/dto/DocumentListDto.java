package com.stanzaliving.ventaInvoice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentListDto {
    private HashMap<String, List<ListDto>> data;
}
