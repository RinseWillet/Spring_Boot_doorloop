package com.itvitae.doorloopDemo.bedrijf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BedrijfService {

    @Autowired
    BedrijfRepository bedrijfRepository;

    //methods
    public void maakTestBedrijf() {
        bedrijfRepository.save(new Bedrijf("test", 999999, 0.00));
        System.out.println("We hebben een test bedrijf gemaakt in de service");
    }

    public Iterable<Bedrijf> getAllBedrijf() {
        System.out.println("in service: getAllBedrijf");
        return bedrijfRepository.findAll();
    }

    public Bedrijf addBedrijf(Bedrijf bedrijf) {
        System.out.println("in service: addBedrijf");
        return bedrijfRepository.save(bedrijf);
    }

    public Bedrijf getById(long id) {
        System.out.println("in service: getById");
        return bedrijfRepository.findById(id).get();
    }

    public void deleteBedrijf(long id) {
        System.out.println("in service: delete ");
        bedrijfRepository.deleteById(id);
    }
}
