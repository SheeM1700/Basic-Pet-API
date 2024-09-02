package com.spring.api.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class OwnerDTO {

    private Long id;

    @NotBlank
    @Size(min = 3, max = 15)
    private String name;

    @NotBlank
    @Size(min = 3, max = 15)
    private String lastName;

    @NotNull
    private byte age;

    @NotBlank
    @Size(min = 8, max = 50)
    private String address;

    @NotBlank
    @Email
    private String email;

}
