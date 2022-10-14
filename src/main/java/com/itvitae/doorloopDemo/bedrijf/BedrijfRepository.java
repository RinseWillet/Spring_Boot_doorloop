package com.itvitae.doorloopDemo.bedrijf;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface BedrijfRepository extends CrudRepository<Bedrijf, Long> {
}
