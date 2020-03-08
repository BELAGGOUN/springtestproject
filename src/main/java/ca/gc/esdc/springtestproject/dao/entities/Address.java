package ca.gc.esdc.springtestproject.dao.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
//@Table(name = "t_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String street;
    private String city;

    //Adding bidirectionel Relation
    @OneToOne(mappedBy = "address")
     private Person person ;
}
