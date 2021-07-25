package com.stanzaliving.core.opscalculator.dto.summary;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
@AllArgsConstructor
@Data
@SuperBuilder
public class EquipmentRentalSummaryDto extends CategorySummaryDto{
    
    private DisplaySummaryDto roomDth;
    private DisplaySummaryDto vendingMachine;
    private DisplaySummaryDto coffeeMachine;
    private DisplaySummaryDto washingMachine;
    private DisplaySummaryDto microwave;
    private DisplaySummaryDto singleDoorFridge;
    private DisplaySummaryDto doubleDoorFridge;
    private DisplaySummaryDto waterDispenser;
    private DisplaySummaryDto dryer;
    private DisplaySummaryDto ac;
    private DisplaySummaryDto powerBackup;
    private DisplaySummaryDto roomGeyser;
    private DisplaySummaryDto commonGeyser;
    private DisplaySummaryDto ro;
    private DisplaySummaryDto tv;
    private DisplaySummaryDto treadmill;
    private DisplaySummaryDto multiGym;
    private DisplaySummaryDto facialRecognition;
    private DisplaySummaryDto smartLock;
}
