
package com.henry.iam.controller;

import com.henry.iam.model.dto.request.CanAccessReq;
import com.henry.iam.model.dto.response.CanAccessResponse;
import com.henry.iam.service.AccessService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "access")
@AllArgsConstructor
public class AccessController {
    private AccessService accessService;

    @PostMapping("canAccess")
    public CanAccessResponse canAccess(@RequestBody @Valid final CanAccessReq req) {
        return accessService.canAccess(req);
    }

}
