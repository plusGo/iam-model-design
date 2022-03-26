package com.henry.iam.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName("iam_authorization_record")
public class AuthorizationRecord {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @TableField(value = "identity_real_id")
    private String identityRealId;

    @TableField(value = "identity_id")
    private Long identityId;

    @TableField(value = "resource_real_id")
    private String resourceRealId;

    @TableField(value = "resource_id")
    private Long resourceId;

    @TableField(value = "expire_time")
    private LocalDateTime expireTime;

    @TableField("conditions")
    private String conditions;

}
