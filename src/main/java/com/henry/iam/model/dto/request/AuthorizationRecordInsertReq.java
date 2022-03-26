package com.henry.iam.model.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 授权记录
 */
@Data
public class AuthorizationRecordInsertReq {

    @NotNull
    private Long identityId;

    @NotNull
    private Long resourceId;

    @NotNull
    private List<String> conditions;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expireTime;
}
