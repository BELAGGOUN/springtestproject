package ca.gc.esdc.springtestproject.dao.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "t_person")
public class Person {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nId;
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date dateBirth;
    private long age;

    @Transient
    private String nas;
    //ADDING THE RELATION ATTRIBUTE BETWEEN TABLES


    @OneToOne
    @JoinColumn(name= "Adr_FK")
    private Address address;

    // case c
   // @OneToMany
   // private List<Car> cars;

    //case d
    @JsonBackReference
    @OneToMany(mappedBy = "owner" )
    private List<Car> cars;


}
