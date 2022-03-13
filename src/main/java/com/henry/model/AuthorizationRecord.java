package com.henry.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 授权记录
 */
@Data
public abstract class AuthorizationRecord {
    protected Long id;

    protected Identity identity;
    protected Resource resource;
    protected List<Condition> conditions;
    protected LocalDateTime expireTime;
}
