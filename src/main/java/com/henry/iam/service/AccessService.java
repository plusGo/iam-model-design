package com.henry.iam.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.ImmutableList;
import com.henry.iam.mapper.AuthorizationRecordMapper;
import com.henry.iam.model.dto.request.CanAccessReq;
import com.henry.iam.model.dto.response.CanAccessResponse;
import com.henry.iam.model.po.AuthorizationRecord;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AccessService extends ServiceImpl<AuthorizationRecordMapper, AuthorizationRecord> {
    private AuthorizationRecordService authorizationRecordService;

    public CanAccessResponse canAccess(final CanAccessReq req) {
        final Optional<AuthorizationRecord> record = authorizationRecordService.getByRealIds(req.getIdentityRealId(), req.getResourceRealId());
        if (!record.isPresent()) {
            return new CanAccessResponse(false, ImmutableList.of("无授权记录"));
        }
        if (record.get().getExpireTime().isBefore(LocalDateTime.now())) {
            return new CanAccessResponse(false, ImmutableList.of("授权已过期"));
        }
        return new CanAccessResponse(true, ImmutableList.of());
    }
}
