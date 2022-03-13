package com.henry.model;

import com.henry.model.enums.IdentityType;
import lombok.Data;

/**
 * 终端
 */
@Data
public abstract class Identity {
    protected Long id;
    protected IdentityType type;
}
