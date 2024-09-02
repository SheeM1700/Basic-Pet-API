package com.spring.api.service;

import com.spring.api.controller.dto.PetDTO;
import com.spring.api.persistence.model.Breed;
import com.spring.api.persistence.model.Owner;
import com.spring.api.persistence.model.Pet;
import com.spring.api.persistence.repository.PetRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    private final PetRepository petRepository;

    @Autowired
    public PetService(PetRepository petRepository){
        this.petRepository = petRepository;
    }

    //Save Pet
    public Pet savePet(PetDTO petDTO){
        Pet pet = Pet.builder()
                .name(petDTO.getName())
                .lastName(petDTO.getLastName())
                .age(petDTO.getAge())
                .color(petDTO.getColor())
                .size(petDTO.getSize())
                .weight(petDTO.getWeight())
                .breed(Breed.builder()
                        .name(petDTO.getBreedDTO().getName())
                        .build())
                .owner(Owner.builder()
                        .name(petDTO.getOwnerDTO().getName())
                        .lastName(petDTO.getOwnerDTO().getLastName())
                        .age(petDTO.getOwnerDTO().getAge())
                        .address(petDTO.getOwnerDTO().getAddress())
                        .email(petDTO.getOwnerDTO().getEmail())
                        .build())
                .build();

        return this.petRepository.save(pet);
    }

    //Get All
    public List<Pet> findAll(){
        return (List<Pet>) petRepository.findAll();
    }

    //Get by id
    public Optional<Pet> findById(Long id){
        return this.petRepository.findById(id);
    }

    //Update - Revisar
    public Pet updatePet(PetDTO petDTO, Long id){
        Pet pet = petRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("La mascota con id " + id + "no existe"));

        pet.setAge(petDTO.getAge());
        pet.setWeight(petDTO.getWeight());

        return petRepository.save(pet);
    }


    //Delete by id
    public void String (Long id){
        this.petRepository.deleteById(id);
    }
}
