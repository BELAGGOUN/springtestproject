package ca.gc.esdc.springtestproject.entities;


import com.sun.javafx.geom.transform.Identity;
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
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int nId;
    private String firstName;
    private String lastName;
    private Date dateBirth;
    private Integer age;
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
    @OneToMany(mappedBy = "owner")
    private List<Car> cars;


}
