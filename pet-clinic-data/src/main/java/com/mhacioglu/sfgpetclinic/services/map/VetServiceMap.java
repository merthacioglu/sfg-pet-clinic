package com.mhacioglu.sfgpetclinic.services.map;

import com.mhacioglu.sfgpetclinic.model.Pet;
import com.mhacioglu.sfgpetclinic.model.Speciality;
import com.mhacioglu.sfgpetclinic.model.Vet;
import com.mhacioglu.sfgpetclinic.services.CrudService;
import com.mhacioglu.sfgpetclinic.services.SpecialityService;
import com.mhacioglu.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap  extends AbstractMapService<Vet, Long> implements VetService {
    private SpecialityService specialityService;
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

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0) {
            object.getSpecialities().forEach(sp -> {
                if (sp.getId() == null) {
                    Speciality savedSpeciality = specialityService.save(sp);
                    sp.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
