package com.henry.iam.model;

import com.henry.iam.model.enums.IdentityType;
import lombok.Data;

/**
 * 终端
 */
@Data
public abstract class Identity {
    protected Long id;
    protected IdentityType type;
}
