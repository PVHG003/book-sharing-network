package vn.pvhg.book.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @NotEmpty(message = "Firstname is required")
        @NotBlank(message = "Firstname is required")
        String firstname,

        @NotEmpty(message = "Lastname is required")
        @NotBlank(message = "Lastname is required")
        String lastname,

        @Email(message = "Not correct email format")
        @NotEmpty(message = "Email is required")
        @NotBlank(message = "Email is required")
        String email,

        @Size(min = 8, message = "Password must be 8 or more characters")
        @NotEmpty(message = "Password is required")
        @NotBlank(message = "Password is required")
        String password
) {
}
