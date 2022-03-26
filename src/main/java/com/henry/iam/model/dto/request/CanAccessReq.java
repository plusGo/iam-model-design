package com.henry.iam.model.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CanAccessReq {

    @NotNull
    private String identityRealId;

    @NotNull
    private String resourceRealId;

}
