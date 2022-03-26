package com.henry.iam.model.dto.request;

import com.henry.iam.model.enums.IdentityType;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;


@Data
public class IdentityInsertReq {
    @NotNull
    private IdentityType type;

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
