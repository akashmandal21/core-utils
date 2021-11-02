package com.stanzaliving.filixIntegration.Enum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CustomerApiActionEnum {
    CREATE("CREATE"),
    UPDATE("UPDATE");
    String name;
}
