package com.stanzaliving.operations.dto.servicemix;

import com.stanzaliving.operations.enums.PowerBackupEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class PowerBackup extends BooleanService {
	private PowerBackupEnum type;
}
