package com.henry.iam.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  ResourceType implements BaseDBEnum {
    API(0, "接口"),
    FIELD(1, "字段"),
    USER_INFO(2, "用户信息"),
    ORG_INFO(3, "机构信息"),
    ENTERPRISE_INFO(4, "企业信息"),
    ACCOUNT(5, "账户");

    static {
        subClass.add(ResourceType.class);
    }

    private final Integer value;
    private final String name;
}
