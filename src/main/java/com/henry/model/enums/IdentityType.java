package com.henry.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IdentityType implements BaseDBEnum {
    USER(0, "用户"),
    APPLICATION(1, "应用");

    static {
        subClass.add(IdentityType.class);
    }

    private final Integer value;
    private final String name;
}
