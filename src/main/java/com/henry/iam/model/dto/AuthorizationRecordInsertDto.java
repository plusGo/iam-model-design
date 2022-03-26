package com.henry.iam.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 授权记录
 */
@Data
public class AuthorizationRecordInsertDto {
    private Long id;

    private Long identityId;

    private String identityRealId;

    private Long resourceId;

    private String resourceRealId;

    private List<String> conditions;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expireTime;
}
