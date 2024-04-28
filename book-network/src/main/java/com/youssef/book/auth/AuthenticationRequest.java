package com.youssef.book.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthenticationRequest {

    @Email(message = "Email is not valid")
    @NotEmpty(message = "first name required")
    @NotBlank(message = "first name required")
    private String email;

    @NotEmpty(message = "first name required")
    @NotBlank(message = "first name required")
    @Size(min = 8, message = "Password should be at least 8 characters")
    private String password;
}
