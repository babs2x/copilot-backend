package com.example.CopilotBackend.DTO;

import lombok.Data;

@Data
public class UserRequestDTO {
    private String name;
    private String password;
    private String email;
}
