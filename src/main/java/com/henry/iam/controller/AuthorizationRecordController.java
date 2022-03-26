package com.henry.iam.controller;

import com.henry.iam.model.dto.AuthorizationRecordInsertDto;
import com.henry.iam.model.dto.request.AuthorizationRecordInsertReq;
import com.henry.iam.service.AuthorizationRecordService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "authorizationRecords")
@AllArgsConstructor
public class AuthorizationRecordController {
    private AuthorizationRecordService authorizationRecordService;

    @PostMapping()
    public void insert(@RequestBody @Valid final AuthorizationRecordInsertReq req) {
        authorizationRecordService.insert(req);
    }

    @GetMapping("identity/{identityId}")
    public List<AuthorizationRecordInsertDto> getListByIdentityId(@PathVariable("identityId") final Long identityId) {
        return authorizationRecordService.getListByIdentityId(identityId);
    }

}
