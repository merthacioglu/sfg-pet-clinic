package com.mhacioglu.sfgpetclinic.bootstrap;

import com.mhacioglu.sfgpetclinic.model.Owner;
import com.mhacioglu.sfgpetclinic.model.Vet;
import com.mhacioglu.sfgpetclinic.services.OwnerService;
import com.mhacioglu.sfgpetclinic.services.VetService;
import com.mhacioglu.sfgpetclinic.services.map.OwnerServiceMap;
import com.mhacioglu.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }
    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();

        owner1.setFirstName("mert");
        owner1.setLastName("hacioglu");
        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Bryan");
        owner2.setLastName("Stone");
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
