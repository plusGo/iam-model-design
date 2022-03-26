package com.henry.iam.mapping;


import cn.hutool.json.JSONUtil;
import com.henry.iam.model.dto.AuthorizationRecordInsertDto;
import com.henry.iam.model.po.AuthorizationRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface AuthorizationRecordMapping {
    @Mapping(source = "conditions", target = "conditions", qualifiedByName = "conditionsToConditions")
    AuthorizationRecordInsertDto poToDto(final AuthorizationRecord po);

    @Named("conditionsToConditions")
    default List<String> tagsToTags(final String conditions) {
        return Optional.ofNullable(conditions)
                .map(tagStr -> JSONUtil.toList(conditions, String.class))
                .orElse(null);
    }
}
