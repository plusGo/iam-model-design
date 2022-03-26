DROP TABLE IF EXISTS iam_resource;
CREATE TABLE iam_resource(
                          `id` bigint NOT NULL  COMMENT '主键' ,
                          `real_id` unique VARCHAR(255) NOT NULL  COMMENT 'resource代表的资源的真实ID' ,
                          `name` VARCHAR(255) NOT NULL   COMMENT '名称' ,
                          `description` VARCHAR(1024) COMMENT '描述' ,
                          `real_brief_data` VARCHAR(1024) COMMENT 'resource代表的资源的简要数据' ,
                          `type` tinyint  NOT NULL  COMMENT '类型' ,
                          PRIMARY KEY (`id`),
                          KEY `real_id` (`real_id`),
                          KEY `name` (`name`)
) ENGINE=InnoDB COLLATE = utf8_bin COMMENT = 'IAM资源';

DROP TABLE IF EXISTS iam_identity;
CREATE TABLE iam_identity(
                             `id` bigint NOT NULL  COMMENT '主键' ,
                             `real_id` unique VARCHAR(255) NOT NULL  COMMENT 'identity代表的资源的真实ID' ,
                             `name` VARCHAR(255) NOT NULL   COMMENT '名称' ,
                             `description` VARCHAR(1024) COMMENT '描述' ,
                             `real_brief_data` VARCHAR(1024) COMMENT 'identity代表的资源的简要数据' ,
                             `type` tinyint  NOT NULL  COMMENT '类型' ,
                             PRIMARY KEY (`id`),
                             KEY `real_id` (`real_id`),
                             KEY `name` (`name`)
) ENGINE=InnoDB COLLATE = utf8_bin COMMENT = 'IAM实体';

DROP TABLE IF EXISTS iam_authorization_record;
CREATE TABLE iam_authorization_record(
                             `id` bigint NOT NULL  COMMENT '主键' ,
                             `identity_real_id`  VARCHAR(255) NOT NULL  COMMENT 'identity代表的资源的真实ID' ,
                             `identity_id`  bigint NOT NULL  COMMENT 'identityID' ,
                             `resource_real_id`  VARCHAR(255) NOT NULL  COMMENT 'resource代表的资源的真实ID' ,
                             `resource_id`  bigint NOT NULL  COMMENT 'resourceID' ,
                             `conditions` VARCHAR(1024)  COMMENT '前提' ,
                             `expire_time` DATETIME COMMENT '过期时间' ,
                             PRIMARY KEY (`id`),
                             KEY `identity_real_id_resource_real_id` (`identity_real_id`,`resource_real_id`),
                             KEY `identity_id_resource_id` (`identity_id`,`resource_id`)
) ENGINE=InnoDB COLLATE = utf8_bin COMMENT = 'IAM授权记录';
