package com.mhacioglu.sfgpetclinic.services.map;

import com.mhacioglu.sfgpetclinic.model.Pet;
import com.mhacioglu.sfgpetclinic.model.Visit;
import com.mhacioglu.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit object) {
        Optional.ofNullable(object)
                .map(Visit::getPet)
                .map(Pet::getOwner)
                .filter(owner -> owner.getId() != null)
                .orElseThrow(() -> new RuntimeException("Invalid Visit"));
        return super.save(object);

    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
