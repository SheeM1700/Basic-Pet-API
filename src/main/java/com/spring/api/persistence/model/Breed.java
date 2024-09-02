package com.spring.api.persistence.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "breed")
@Builder
public class Breed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /*
    @OneToMany(targetEntity = Pet.class, fetch = FetchType.EAGER, mappedBy = "breed")
    private List<Pet> breedPetList;
     */
}
