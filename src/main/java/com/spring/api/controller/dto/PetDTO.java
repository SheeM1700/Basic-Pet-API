package com.spring.api.controller.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetDTO {

    private Long id;

    @NotNull
    @Size(min = 3, max = 15)
    private String name;

    @NotBlank
    @Size(min = 3, max = 15)
    private String lastName;

    @NotNull
    private byte age;

    @NotBlank
    private String color;

    @NotNull
    private String size;

    @NotNull
    @Digits(integer = 2, fraction = 2)
    private double weight;

    @Valid
    private BreedDTO breedDTO;

    @Valid
    private OwnerDTO ownerDTO;
}
