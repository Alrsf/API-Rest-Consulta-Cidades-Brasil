package com.github.alrsf.Citiesapi.Pais;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Paises {

    @Id
    private long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String portgueseName;

    @Column(name = "sigla")
    private String code;

    private Integer bacen;

    public Paises() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPortgueseName() {
        return portgueseName;
    }

    public String getCode() {
        return code;
    }

    public Integer getBacen() {
        return bacen;
    }
}
