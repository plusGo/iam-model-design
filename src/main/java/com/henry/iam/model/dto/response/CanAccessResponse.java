package com.henry.iam.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CanAccessResponse {
    private Boolean canAccess;

    private List<String> denyReasons;
}
