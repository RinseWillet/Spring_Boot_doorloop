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
        System.out.println("in service getAllBedrijf");
        return bedrijfRepository.findAll();
    }
}
