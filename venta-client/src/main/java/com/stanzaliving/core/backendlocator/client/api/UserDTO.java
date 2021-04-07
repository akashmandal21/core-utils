package com.stanzaliving.core.backendlocator.client.api;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class UserDTO {

	private String username;

	private String password;

	private Set<String> roles = new HashSet<>();
	
	private Set<String> permissions = new HashSet<>(); 

	private String name;

	private String email;

	private String team;

	private String level;

	private String phone;

	private boolean enabled = true;

}