package com.henry.iam.service;

import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.henry.iam.mapper.AuthorizationRecordMapper;
import com.henry.iam.mapping.AuthorizationRecordMapping;
import com.henry.iam.model.dto.AuthorizationRecordInsertDto;
import com.henry.iam.model.dto.request.AuthorizationRecordInsertReq;
import com.henry.iam.model.po.AuthorizationRecord;
import com.henry.iam.model.po.Identity;
import com.henry.iam.model.po.Resource;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AuthorizationRecordService extends ServiceImpl<AuthorizationRecordMapper, AuthorizationRecord> {
    private IdentityService identityService;
    private ResourceService resourceService;
    private AuthorizationRecordMapping authorizationRecordMapping;

    public void insert(final AuthorizationRecordInsertReq req) {
        final Identity identity = identityService.getById(req.getIdentityId());
        final Resource resource = resourceService.getById(req.getResourceId());

        final AuthorizationRecord recordPo = AuthorizationRecord.builder()
                .identityId(identity.getId())
                .identityRealId(identity.getRealId())
                .resourceId(resource.getId())
                .resourceRealId(resource.getRealId())
                .conditions(JSONUtil.toJsonStr(req.getConditions()))
                .expireTime(req.getExpireTime())
                .build();

        this.save(recordPo);
    }

    public List<AuthorizationRecordInsertDto> getListByIdentityId(final Long identityId) {
        QueryWrapper<AuthorizationRecord> queryWrapper = new QueryWrapper<AuthorizationRecord>()
                .eq("identity_id", identityId);

        return this.list(queryWrapper).stream()
                .map(po -> this.authorizationRecordMapping.poToDto(po))
                .collect(Collectors.toList());
    }

    public Optional<AuthorizationRecord> getByRealIds(final String identityRealId, final String resourceRealId) {
        QueryWrapper<AuthorizationRecord> queryWrapper = new QueryWrapper<AuthorizationRecord>()
                .eq("identity_real_id", identityRealId)
                .eq("resource_real_id", resourceRealId);
        return Optional.ofNullable(this.getOne(queryWrapper));
    }
}
