package com.henry.model.request;

import com.henry.model.enums.ResourceType;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;


@Data
public class ResourceInsertReq {
    @NotNull
    private ResourceType type;

    @NotNull
    @Length(max = 255)
    private String name;

    @NotNull
    @Length(max = 255)
    private String code;

    @Length(max = 1024)
    private String description;

}
