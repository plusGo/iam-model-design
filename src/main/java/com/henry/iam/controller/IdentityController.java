package com.henry.iam.controller;

import com.henry.iam.model.dto.request.IdentityInsertReq;
import com.henry.iam.service.IdentityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "identities")
@AllArgsConstructor
public class IdentityController {
    private IdentityService identityService;

    @PostMapping()
    public void insert(@RequestBody @Valid final IdentityInsertReq req) {
        identityService.insert(req);
    }


}
