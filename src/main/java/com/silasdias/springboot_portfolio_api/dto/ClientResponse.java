package com.silasdias.springboot_portfolio_api.dto;

public record ClientResponse(
        Long id,
        String name,
        String email,
        String phone
) {
}
