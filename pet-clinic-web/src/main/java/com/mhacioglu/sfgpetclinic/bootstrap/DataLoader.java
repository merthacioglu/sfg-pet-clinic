package com.mhacioglu.sfgpetclinic.bootstrap;

import com.mhacioglu.sfgpetclinic.model.Owner;
import com.mhacioglu.sfgpetclinic.model.Pet;
import com.mhacioglu.sfgpetclinic.model.PetType;
import com.mhacioglu.sfgpetclinic.model.Vet;
import com.mhacioglu.sfgpetclinic.services.OwnerService;
import com.mhacioglu.sfgpetclinic.services.PetTypeService;
import com.mhacioglu.sfgpetclinic.services.VetService;
import com.mhacioglu.sfgpetclinic.services.map.OwnerServiceMap;
import com.mhacioglu.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }
    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("mert");
        owner1.setLastName("hacioglu");
        owner1.setAddress("8, Henley Road");
        owner1.setCity("Brighton");
        owner1.setTelephone("51561554112");


        Pet mertsPet = new Pet();
        mertsPet.setPetType(savedCatPetType);
        mertsPet.setName("mert's cat");
        mertsPet.setBirthDate(LocalDate.of(2020, 2, 20));
        mertsPet.setOwner(owner1);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Bryan");
        owner2.setLastName("Stone");
        owner2.setAddress("15, North Street");
        owner2.setCity("York");
        owner2.setTelephone("34543643324");


        Pet bryansDog = new Pet();
        bryansDog.setName("Affectionate pug");
        bryansDog.setBirthDate(LocalDate.of(2016, 7, 15));
        bryansDog.setPetType(savedDogPetType);
        bryansDog.setOwner(owner2);
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();

        vet1.setFirstName("Tim");
        vet1.setLastName("Hamilton");
        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Jack");
        vet2.setLastName("Anderson");
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
