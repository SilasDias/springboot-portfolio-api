package com.silasdias.springboot_portfolio_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ClientRequest(
        @NotBlank String name,
        @NotBlank @Email String email,
        @NotBlank String phone
) {
}
