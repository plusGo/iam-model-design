package com.henry.iam.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.henry.iam.mapper.ResourceMapper;
import com.henry.iam.mapping.ResourceMapping;
import com.henry.iam.model.dto.request.ResourceInsertReq;
import com.henry.iam.model.po.Resource;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ResourceService extends ServiceImpl<ResourceMapper, Resource> {
    private ResourceMapping resourceMapping;

    public void insert(final ResourceInsertReq resourceInsertReq) {
        final Resource resource = resourceMapping.reqToPo(resourceInsertReq);
        this.save(resource);
    }
}
