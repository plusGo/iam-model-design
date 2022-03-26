package com.henry.iam.mapping;


import com.henry.iam.model.po.Identity;
import com.henry.iam.model.dto.request.IdentityInsertReq;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IdentityMapping {
    Identity reqToPo(final IdentityInsertReq request);
}
