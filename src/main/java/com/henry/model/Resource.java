package com.henry.model;

import com.henry.model.enums.ResourceType;
import lombok.Data;

/**
 * 资源
 */
@Data
public abstract class Resource {
    protected Long id;
    protected ResourceType type;
}
