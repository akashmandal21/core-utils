package com.stanzaliving.core.user.dto;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InventoryUserDto {
    private String username;

    private String password;

    private Set<String> roles = new HashSet<>();

    private Set<String> permissions = new HashSet<>();

    private String name;

    private String email;

    private String team;

    private String level;

    private String phone;

    private int cityId;

    private String cityName;

    private String access;

    private boolean enabled;
}
