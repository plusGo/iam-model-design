package com.henry.iam.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.henry.iam.model.enums.ResourceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName("iam_resource")
public class Resource {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    // resource代表的资源的真实ID
    @TableField(value = "real_id")
    private String realId;

    // resource代表的资源的简要数据
    @TableField(value = "real_brief_data")
    private String realBriefData;

    @TableField("name")
    private String name;

    @TableField("description")
    private String description;

    @TableField("type")
    protected ResourceType type;
}
