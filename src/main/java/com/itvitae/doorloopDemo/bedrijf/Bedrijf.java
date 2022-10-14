package com.itvitae.doorloopDemo.bedrijf;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bedrijf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String naam;
    Integer aantalWerknemers;
    Double jaarOmzet;
}
