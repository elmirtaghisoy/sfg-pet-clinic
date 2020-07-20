package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecalityRepository;
import guru.springframework.sfgpetclinic.services.SpecalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecalityService {

    @Autowired
    SpecalityRepository specalityRepository;

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specalityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specalityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specalityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specalityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specalityRepository.deleteById(aLong);
    }
}
