package com.sharkAI.sharkAI.web.dto;

import com.sharkAI.sharkAI.customAnnotations.ValidRoleName;
import lombok.Data;

@Data
public class RoleDto {
    Long id;
    @ValidRoleName
    String name;
}