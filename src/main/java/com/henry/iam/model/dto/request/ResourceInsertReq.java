package com.henry.iam.model.dto.request;

import com.henry.iam.model.enums.ResourceType;
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

    @Length(max = 1024)
    private String description;

    @NotNull
    @Length(max = 255)
    private String realId;

    @Length(max = 1024)
    private String realBriefData;

}
