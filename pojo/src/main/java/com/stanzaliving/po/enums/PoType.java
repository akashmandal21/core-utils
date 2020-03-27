package com.stanzaliving.po.enums;

import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum PoType {

	GC("GC",Arrays.asList(Department.GC,Department.DESIGN)),ASIS("As Is",Arrays.asList(Department.PROCUREMENT,Department.PROJECTS)),BOI("Boi",Arrays.asList(Department.PROCUREMENT,Department.PROJECTS));
	
	private String type;
	
	private List<Department> departments;
	
}
