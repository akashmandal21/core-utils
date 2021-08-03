package com.stanzaliving.residenceservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RoomInventoryLogDto {

    private String inventoryUUID;

    private String roomNumberUUID;

    private float bed;

    private Date fromDate;

    private Date toDate;
}