package com.mhacioglu.sfgpetclinic.services.map;

import com.mhacioglu.sfgpetclinic.model.Pet;
import com.mhacioglu.sfgpetclinic.model.Vet;
import com.mhacioglu.sfgpetclinic.services.CrudService;
import com.mhacioglu.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap  extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long  id) {

    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
