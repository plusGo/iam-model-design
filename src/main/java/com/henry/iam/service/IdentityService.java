package com.henry.iam.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.henry.iam.mapper.IdentityMapper;
import com.henry.iam.mapping.IdentityMapping;
import com.henry.iam.model.po.Identity;
import com.henry.iam.model.dto.request.IdentityInsertReq;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IdentityService extends ServiceImpl<IdentityMapper, Identity> {
    private IdentityMapping identityMapping;

    public void insert(final IdentityInsertReq req) {
        final Identity identity = identityMapping.reqToPo(req);
        this.save(identity);
    }
}
