package com.henry.iam.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AuthorizationRecordStatus implements BaseDBEnum {
    TAKE_EFFECT(0, "已生效"),
    NOT_EFFECT(1, "未生效"),
    FROZEN(2, "已冻结");

    static {
        subClass.add(AuthorizationRecordStatus.class);
    }

    private final Integer value;
    private final String name;
}
