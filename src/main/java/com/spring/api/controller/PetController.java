package com.spring.api.controller;

import com.spring.api.controller.dto.PetDTO;
import com.spring.api.persistence.model.Pet;
import com.spring.api.service.PetService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pet")
@Tag(name = "Endpoints of pets", description = "This endpoints provides information about pets")
public class PetController {

    private PetService petService;

    public PetController(PetService petService){
        this.petService = petService;
    }

    @PostMapping("/save")
    public ResponseEntity<Pet> savePet(@RequestBody @Valid PetDTO petDTO){
        return new ResponseEntity<>(this.petService.savePet(petDTO), HttpStatus.CREATED);
    }

    @GetMapping("/find")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(petService.findAll());
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(this.petService.findById(id).orElseThrow());
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Pet> update(@RequestBody @Valid PetDTO petDTO, @PathVariable Long id){
        return ResponseEntity.ok(this.petService.updatePet(petDTO,id));
    }

    @DeleteMapping("/delete/{id}")
    public String String (@PathVariable Long id){
        petService.String(id);
        return "Mascota eliminada correctamente";
    }

}
