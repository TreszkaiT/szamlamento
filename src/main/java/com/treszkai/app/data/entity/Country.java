package com.treszkai.app.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "SZML_COUNTRY")
public class Country {

    @Id
    @GeneratedValue
    @Column(name = "CNT_ID")
    private Long id;

    @Column(name = "CNT_NAME")
    private String name;

    @OneToOne
    private Partner partner;

    public Country() {
    }

    public Long getId() {
        return id;
    }

    public Country setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Country setName(String name) {
        this.name = name;
        return this;
    }
}
