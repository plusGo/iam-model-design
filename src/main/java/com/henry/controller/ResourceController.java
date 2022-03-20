package com.henry.controller;

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
    @PostMapping()
    @ApiImplicitParam(name = "param", value = "数据新增请求参数")
    public CommonRes insert(@RequestBody @Valid final ResourceInsertReq resourceInsertReq) {
        resourceService.insert(resourceInsertReq);
        return CommonRes.successRes();
    }
}
