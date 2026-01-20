package com.example.CopilotBackend.DTO;
import com.example.CopilotBackend.Entity.ROLE;

import lombok.Data;

@Data
public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;
    private ROLE role;
}
