package com.itvitae.doorloopDemo.bedrijf;

import javax.persistence.*;

//Deze Class is het Model in het MVC schema - het is de blauwdruk die bepaald hoe
//de data wordt opgeslagen in de database.

@Entity
@Table(name = "bedrijf")
public class Bedrijf {

    //fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String naam;
    Integer aantalWerknemers;
    Double jaarOmzet;

    //constructor methode
    public Bedrijf(
            String naam,
            Integer aantalWerknemers,
            Double jaarOmzet) {
        this.naam = naam;
        this.aantalWerknemers = aantalWerknemers;
        this.jaarOmzet = jaarOmzet;
    }

    // Getters and Setters
    // id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    // naam
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    // aantalWerknemers
    public Integer getAantalWerknemers() {
        return aantalWerknemers;
    }

    public void setAantalWerknemers(Integer aantalWerknemers) {
        this.aantalWerknemers = aantalWerknemers;
    }

    //jaarOmzet
    public Double getJaarOmzet() {
        return jaarOmzet;
    }

    public void setJaarOmzet(Double jaarOmzet) {
        this.jaarOmzet = jaarOmzet;
    }
}
