package com.treszkai.app.data.entity;

//import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
//@Audited
@DiscriminatorColumn( name = "ITM_TYPE" )
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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

    @OneToOne(mappedBy = "partner")
    private Country country;

    public Partner() {
    }

    public Long getId() {
        return id;
    }

    public Partner setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Partner setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Partner setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public Partner setCountry(Country country) {
        this.country = country;
        return this;
    }
}
