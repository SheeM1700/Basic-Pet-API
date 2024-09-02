package com.spring.api.persistence.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "pet")
@Builder
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private byte age;

    private String color;

    private String size;

    private double weight;

    @JoinColumn(name = "id_breed")
    @ManyToOne(targetEntity = Breed.class, cascade = CascadeType.PERSIST)
    private Breed breed;

    @JoinColumn(name = "id_owner")
    @ManyToOne(targetEntity = Owner.class, cascade = CascadeType.PERSIST)
    private Owner owner;

}
