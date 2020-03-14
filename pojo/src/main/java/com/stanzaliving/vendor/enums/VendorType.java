package com.stanzaliving.vendor.enums;

import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum VendorType {

	GC("GC",Arrays.asList(Department.GC,Department.PROJECTS,Department.TRANSFORMATIONS)),ASIS("As Is",Arrays.asList(Department.GC,Department.PROJECTS,Department.TRANSFORMATIONS)),BOI("Boi",Arrays.asList(Department.PROCUREMENT,Department.DESIGN,Department.TRANSFORMATIONS));
	
	private String type;
	
	private List<Department> departments;
	
}