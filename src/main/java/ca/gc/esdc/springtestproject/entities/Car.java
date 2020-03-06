package ca.gc.esdc.springtestproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "t_car")
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String  vinNumber;

    // ManyToOne unidirectional case b to explain the case c comment this field , for case d remove the comment
    @ManyToOne
    @JoinColumn(name = "person_fk")
    private Person owner;

}
