package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.PaymentMode;
import com.stanzaliving.operations.enums.PowerBackupEnum;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@ToString(callSuper = true)
public class PowerBackup extends AcquiredBooleanService {
	private PowerBackupEnum type;
	private PaymentMode payment;
	private double rate;
	private double gst;
}
