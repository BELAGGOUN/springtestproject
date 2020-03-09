package ca.gc.esdc.springtestproject.dao.entities;

import lombok.*;

import javax.persistence.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@Entity
//@Table(name = "t_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String street;
    private String city;

    //Adding bidirectionel Relation
//    @OneToOne(mappedBy = "address")
//     private Person person ;
}
