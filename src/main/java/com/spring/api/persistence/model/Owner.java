package com.spring.api.persistence.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "owner")
@Builder
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private byte age;

    private String address;

    private String email;

    /*
    @OneToMany(targetEntity = Pet.class, fetch = FetchType.EAGER, mappedBy = "owner")
    private List<Pet> petList;

     */
}
