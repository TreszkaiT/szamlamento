package com.treszkai.app.data.entity;

import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Audited
@Table(name = "SZML_PARTNER")
public class Partner extends AbstractEntity{

    @Id
    @SequenceGenerator(name = "SEQ_JPA_PARTNER", sequenceName = "SEQ_JPA_PARTNER", initialValue = 100000, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_JPA_PARTNER")
    @Column(name = "PRT_ID")
    private Long id;

    @Column(name = "PRT_FIRST_NAME")
    private String firstName;

    @Column(name = "PRT_LAST_NAME")
    private String lastName;

    @OneToOne
    private Country country;
}
