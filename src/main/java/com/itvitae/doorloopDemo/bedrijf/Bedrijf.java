package com.itvitae.doorloopDemo.bedrijf;

import javax.persistence.*;

@Entity
@Table(name = "bedrijf")
public class Bedrijf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String naam;
    Integer aantalWerknemers;
    Double jaarOmzet;
}
