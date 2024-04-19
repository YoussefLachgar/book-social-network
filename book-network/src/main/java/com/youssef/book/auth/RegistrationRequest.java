package com.youssef.book.auth;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "first name required")
    @NotBlank(message = "first name required")
    private String firstname;

    @NotEmpty(message = "first name required")
    @NotBlank(message = "first name required")
    private String lastname;

    @Email(message = "Email is not valid")
    @NotEmpty(message = "first name required")
    @NotBlank(message = "first name required")
    private String email;

    @NotEmpty(message = "first name required")
    @NotBlank(message = "first name required")
    @Size(min = 8, message = "Password should be at least 8 characters")
    private String password;
}
