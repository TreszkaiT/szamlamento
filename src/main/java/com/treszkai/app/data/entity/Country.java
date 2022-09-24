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

}
