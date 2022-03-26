package com.henry.iam.controller;

import com.henry.iam.model.dto.request.ResourceInsertReq;
import com.henry.iam.service.ResourceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "resources")
@AllArgsConstructor
public class ResourceController {
    private ResourceService resourceService;

    @PostMapping()
    public void insert(@RequestBody @Valid final ResourceInsertReq resourceInsertReq) {
        resourceService.insert(resourceInsertReq);
    }
}
