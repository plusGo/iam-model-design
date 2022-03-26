package com.henry.iam.mapping;


import com.henry.iam.model.po.Resource;
import com.henry.iam.model.dto.request.ResourceInsertReq;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ResourceMapping {
    Resource reqToPo(final ResourceInsertReq request);
}
